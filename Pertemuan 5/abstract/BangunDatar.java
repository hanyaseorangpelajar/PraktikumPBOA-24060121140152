/*
 * Nama File    : BangunDatar.java
 * Nama Pembuat : Adri Audifirst
 * NIM          : 24060121140152
 * Deskripsi    : kelas abstrak, berisi abstraksi bangun datar
 * Tanggal      : 26 Maret 2023
 */

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l) {
        luas = l;
    }

    public double getLuas() {
        return luas;
    }
}