/**
 * Nama: Adri Audifirst
 * NIM: 24060121140152
 * File: Lingkaran.java
 * Deskripsi: implementasi Lingkaran sebagai BangunDatar
 * Tanggal: 17 Mei 2023
*/
public class Lingkaran extends BangunDatar{
    private double jejari;
    
    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    public double hitungKeliling() {
        return 2*jejari*3.14;
    }
}