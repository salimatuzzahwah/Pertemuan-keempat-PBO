/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Salimatuz Zahwah
 */
public class Update extends Connector {

    Scanner sc = new Scanner(System.in);

    public void MemperbaruiData() {
        System.out.print("Masukkan Plat Nomor yang akan di Update: ");
        String PlatNomor = sc.nextLine();
        System.out.print("Masukkan nama kolom yang akan di Update (Merk/Warna/TanggalProduksi): ");
        String kolom = sc.nextLine();
        System.out.print("Masukkan Nilai Baru: ");
        String NilaiBaru = sc.nextLine();

        String sql = "UPDATE kendaraan SET " + kolom + "= ? WHERE PlatNomor = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, NilaiBaru);
            stmt.setString(2, PlatNomor);

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Data berhasil diupdate! ");
            } else {
                System.out.println("Data dengan Plat Nomor " + PlatNomor + " tidak ditemukan!");
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengisi DATA!");
            e.printStackTrace();
        }

    }

}
