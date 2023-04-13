/*
 * Nama File    : Barang.java
 * Nama Pembuat : Adri Audifirst
 * NIM          : 24060121140152
 * Deskripsi    : Kelas Barang memiliki atribut id, nama, dan stok. Selain itu, di dalamnya terdapat method kurangiStok untuk mengurangi stok barang yang telah dimasukkan.
 * Tanggal      : 13 April 2023
 */
public class Barang {
    // TODO 1
    private String id;
    private String nama;
    private int stok;

    public Barang(String id, String nama, int stok) {
        // TODO 2
        this.id = id;
        this.nama = nama;
        this.stok = stok;
    }
        // TODO 3 Buat Getter
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok(int jumlah) {
        // TODO 4
        if (stok >= jumlah) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi");
        }
    }
}
// Made with <3 by Adri Audifirst