/*
 * Nama File    : Asersi1.java
 * Nama Pembuat : Adri Audifirst
 * NIM          : 24060121140152
 * Deskripsi    : Program untuk menunjukkan asersi
 * Tanggal      : 1 April 2023
 */
 public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
 }