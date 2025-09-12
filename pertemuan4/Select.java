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
public class Select extends Connector {

    Scanner sc = new Scanner(System.in);

    public void tampilkanData() {
        String sql = "SELECT * FROM kendaraan";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("Plat Nomor: " + rs.getString("PlatNomor") + "|"
                        + "Merk: " + rs.getString("Merk") + "|"
                        + "Warna: " + rs.getString("Warna") + "|"
                        + "Tanggal Produksi: " + rs.getString("TanggalProduksi") + "|"
                );

            }
        } catch (SQLException e) {
            System.out.println("Gagal menampilkan DATA!");
            e.printStackTrace();
        }
    }
}
