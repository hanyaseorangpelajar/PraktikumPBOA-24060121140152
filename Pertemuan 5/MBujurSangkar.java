/*
 * Nama File    : MBujurSangkar.java
 * Nama Pembuat : Adri Audifirst
 * NIM          : 24060121140152
 * Deskripsi    : kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 * Tanggal      : 26 Maret 2023
 */

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar persegi = new BujurSangkar();
        System.out.print("Masukan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + persegi.hitungLuas(sisi));
    }
}
