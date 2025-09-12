/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

import java.sql.*;
import java.util.Scanner;
/**
 * @author Salimatuz Zahwah
 */
public class Delete extends Connector {

    Scanner sc = new Scanner(System.in);

    public void HapusData() {

        System.out.print("Plat Nomor yang akan dihapus: ");
        String PlatNomor = sc.nextLine();

        String sql = "DELETE FROM kendaraan WHERE PlatNomor=?";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, PlatNomor);

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Data berhasil dihapus!");
            } else {
                System.out.println("Data dengan Plat Nomor " + PlatNomor + " tidak ditemukan!");
            }

        } catch (SQLException e) {
            System.out.println("Gagal mengisi DATA!");
            e.printStackTrace();
        }
    }
}
