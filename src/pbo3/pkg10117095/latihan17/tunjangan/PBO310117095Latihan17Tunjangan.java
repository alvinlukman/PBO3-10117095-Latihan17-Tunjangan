/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117095.latihan17.tunjangan;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama      : Alvin Lukman Nulhakim 
 * Kelas     : IF3 
 * NIM       : 10117095 
 * Deskripsi : Program ini berisi program untuk menghitung tunjangan karyawan
 */
public class PBO310117095Latihan17Tunjangan {

   
    public static void main(String[] args) {
        double gajiPokok;
        double tunjangan;
        double totalAkhir;
        String status = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("=========Program Tunjangan=========");
        System.out.print("Berapa Gaji Pokok anda perbulan? Rp. ");
        gajiPokok = scanner.nextDouble();
        System.out.print("Status anda (Menikah/Belum)? ");
        status = scanner.next();

        if ("Menikah".equals(status)) {
            tunjangan = gajiPokok * 0.35;
        } else {
            tunjangan = 0;
        }

        totalAkhir = tunjangan + gajiPokok;

        System.out.println("========Hasil Perhitungan Gaji Anda=========");
        System.out.println("Gaji Pokok\t\t : Rp. " + gajiPokok);
        System.out.println("Tunjangan\t\t : Rp. " + tunjangan);
        System.out.println("Total Gaji\t\t : Rp. " + totalAkhir);
        System.out.println("(Developed by : Muhammad Yunus)");
    }
    
}
