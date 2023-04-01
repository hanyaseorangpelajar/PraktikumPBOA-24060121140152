/*
 * Nama File    : Asersi2.java
 * Nama Pembuat : Adri Audifirst
 * NIM          : 24060121140152
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input
                    jari-jari lingkaran yang bernilai nol
 * Tanggal      : 1 April 2023
 */
 //class lingkaran
 class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
 }
 //class Asersi2
 public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran " +kelilingLingkaran);
    }
 }