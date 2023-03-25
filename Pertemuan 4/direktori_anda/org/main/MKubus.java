/**
File : MKubus.java 15/03/2023
Penulis : Adri Audifirst
Deskripsi : driver class untuk poligon dan kubus
 */
package org.main;

import org.bangundatar.*;
import org.bangundatar.BujurSangkar; // TODO 1 harus memanfaatkan class Kubus untuk menghitung luas alas dan volume

public class MKubus{
    public static void main (String[] args) {
        BujurSangkar bujursangkar = new BujurSangkar(4.0);
        // TODO 2 inisiasi variable dengan menggunakan class Kubus
        System.out.println("Luas Permukaan Kubus dengan panjang sisi 4 satuan: "+bujursangkar.hitungLuas());

        BujurSangkar bujursangkar2 = new BujurSangkar(8.0);
        System.out.println("Luas Permukaan Kubus dengan panjang sisi 4 satuan: "+bujursangkar2.hitungLuas());
    }
}
