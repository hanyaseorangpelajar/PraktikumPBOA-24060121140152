/**
 * Nama: Adri Audifirst
 * NIM: 24060121140152
 * File: BangunDatarGenericTest.java
 * Deskripsi: main class untuk generic bangun datar
 * Tanggal: 17 Mei 2023
*/
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran (2);
        BangunDatarGeneric<Lingkaran> bdg =
                new BangunDatarGeneric<Lingkaran>();
        bdg.set(lingkaran1);
        System.out.println("keliling lingkaran : "
                                    +bdg.hitungKeliling());
        System.out.println("tipe generic : "
                                    +bdg.get().getClass().getName());
    }
}