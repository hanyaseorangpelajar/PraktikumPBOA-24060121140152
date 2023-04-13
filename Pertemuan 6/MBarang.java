/*
 * Nama File    : MBarang.java
 * Nama Pembuat : Adri Audifirst
 * NIM          : 24060121140152
 * Deskripsi    : Kelas MBarang merupakan kelas yang berisi penyelesaian akhir.
 * Tanggal      : 13 April 2023
 */
public class MBarang {
    public static void beliBarang(Barang barang, int jumlah) throws StokException {
        if (jumlah > barang.getStok()) {
            // TODO 6
            throw new StokException(barang);
        } else {
            // TODO 7
            System.out.println("Anda berhasil membeli " + jumlah + " " + barang.getNama()  + ".");
            // TODO 8
            barang.kurangiStok(jumlah);
        }
    }
    
    public static void main(String[] args) {
        // TODO 9 Barang barang = new Barang("B001", "Celana", 10);
        Barang celana = new Barang("B001", "Celana", 10);
        try {
            // TODO 10
            beliBarang(celana, 15);
        } catch (StokException e) {
            // TODO 11
            System.out.println(e.getMessage());
            System.out.println("Mohon maaf, stok barang tidak mencukupi.");
        }
    }
}
// Made with <3 by Adri Audifirst