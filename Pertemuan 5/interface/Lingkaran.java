/*
 * Nama File    : Lingkaran.java
 * Nama Pembuat : Adri Audifirst
 * NIM          : 24060121140152
 * Deskripsi    : kelas implementasi IArea berupa cara menghitung luas lingkaran
 * Tanggal      : 26 Maret 2023
 */
//mengambil konstanta yang ada di kelas java.lang.Math
 import static java.lang.Math.PI;

class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}
