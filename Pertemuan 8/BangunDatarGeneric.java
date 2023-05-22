/**
 * Nama: Adri Audifirst
 * NIM: 24060121140152
 * File: BangunDatarGeneric.java
 * Deskripsi kelas konstruksi generic untuk BangunDatar
 * Tanggal: 17 Mei 2023
*/
public class BangunDatarGeneric<T extends BangunDatar>{
    private T bangunDatar;

    public void set (T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get () {
        return bangunDatar;
    }

    public double hitungKeliling () {
        return bangunDatar.hitungKeliling();
    }

}