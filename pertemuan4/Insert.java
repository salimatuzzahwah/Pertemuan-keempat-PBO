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
public class Insert extends Connector {

    Scanner sc = new Scanner(System.in);

    public void tambahData() {
        String sql = "INSERT INTO kendaraan VALUES(?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); PreparedStatement stmt = conn.prepareStatement(sql)) {

                System.out.println("MENGISI DATA: ");
                System.out.print("Plat Nomor: ");
                String PlatNomor = sc.nextLine();
                System.out.print("Merk: ");
                String Merk = sc.nextLine();
                System.out.print("Warna: ");
                String Warna = sc.nextLine();
                System.out.print("Tanggal Produksi: ");
                String TanggalProduksi = sc.nextLine();

                stmt.setString(1, PlatNomor);
                stmt.setString(2, Merk);
                stmt.setString(3, Warna);
                stmt.setString(4, TanggalProduksi);
                stmt.executeUpdate();
                System.out.println("Data berhasil ditambahkan");
            } catch (SQLException e){
            System.out.println("Gagal mengisi DATA!");
            e.printStackTrace();
        }
        }
    }
