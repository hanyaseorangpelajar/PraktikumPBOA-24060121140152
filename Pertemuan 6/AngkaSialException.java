/*
 * Nama File    : AngkaException.java
 * Nama Pembuat : Adri Audifirst
 * NIM          : 24060121140152
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Tanggal      : 1 April 2023
 */
 public class AngkaSialException extends Exception{
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
 }