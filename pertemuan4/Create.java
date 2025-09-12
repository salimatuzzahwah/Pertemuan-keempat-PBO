/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

import java.sql.*;

/**
 *
 * @author Salimatuz Zahwah
 */
public class Create extends Connector {

    public static void main (String args[]){
        
        String QUERY = "CREATE TABLE kendaraan ("
                + "PlatNomor varchar(11), "
                + "Merk varchar(100), "
                + "Warna varchar(100), "
                + "TanggalProduksi varchar(50),"
                + "PRIMARY KEY (PlatNomor));";
        try (Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
                Statement stmt = conn.createStatement()) {
            stmt.execute(QUERY);
            System.out.println("Tabel berhasil dibuat");
        } catch  (SQLException e){
            System.out.println("Gagal membuat tabel");
            e.printStackTrace();

        }
    }

}

