/**
File : MPoligon.java 08/03/2023
Penulis : Adri Audifirst
Deskripsi : driver class untuk poligon dan persegipanjang
 */
package org.main;

import org.bangundatar.*;

public class MPoligon{
    public static void main (String[] args) {
        /*PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo ();
        System.out.println("Luas Persegi Panajang : "+persegi.hitungLuas());*/

        Segitiga segitiga = new Segitiga(10,10,3);
        segitiga.printInfo ();
        System.out.println("Luas Persegi Panajang : "+segitiga.hitungLuas());
    }
}