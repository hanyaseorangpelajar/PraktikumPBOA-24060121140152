/*
 * Nama File    : StokException.java
 * Nama Pembuat : Adri Audifirst
 * NIM          : 24060121140152
 * Deskripsi    : Kelas StokException merupakan kelas turunan dari kelas Exception. Jika dipanggil, maka akan keluar output ” Stok {nama barang} {nomor id} tidak cukup!”.
 * Tanggal      : 13 April 2023
 */
public class StokException extends Exception {
    public StokException(Barang barang) {
        // TODO 5
        super("Stok barang " + barang.getNama() + " " + "(" + barang.getId() + ")" + " tidak cukup!");
    }
}
// Made with <3 by Adri Audifirst