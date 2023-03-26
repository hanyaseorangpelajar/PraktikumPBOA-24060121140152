/*
 * Nama File    : BangunDatar.java
 * Nama Pembuat : Adri Audifirst
 * NIM          : 24060121140152
 * Deskripsi    : File implementasi cara mengihtung luas lingkaran
 * Tanggal      : 26 Maret 2023
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan panjang jari-jari lingkaran : ");
        double jari = scan.nextDouble();
        Lingkaran lr = new Lingkaran(jari);
        System.out.println("Luas lingkaran dengan jejari " + jari + " satuan adalah : " + lr.hitungLuas());
    }
}
