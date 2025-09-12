/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author Salimatuz Zahwah
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("======== MENU UTAMA ========");

            System.out.println("1. Insert Data");
            System.out.println("2. Select Data");
            System.out.println("3. Update Data");
            System.out.println("4. Delete Data");
            System.out.println("0. Keluar");
            System.out.print("PILIHAN> ");
            pilih = Integer.parseInt(sc.nextLine());

            switch (pilih) {

                case 1:
                    Insert insert = new Insert();
                    insert.tambahData();
                    break;
                case 2:
                    Select select = new Select();
                    select.tampilkanData();
                    break;
                case 3:
                    Update update = new Update();
                    update.MemperbaruiData();
                    break;
                case 4:
                    Delete delete = new Delete();
                    delete.HapusData();
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 0);
        sc.close();
    }
}
