/*
 * File			: Pegawai.java
 * Nama Pembuat : Adri Audifirst
 * NIM			: 24060121140152
 * Deskripsi 	: Program kelas parent Pegawai
 * Tanggal		: 14 Mei 2023
*/

public class Pegawai {
	protected String nama;
	protected int gajiPokok = 5000000;
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public void tampilData() {
		System.out.println("Nama : " + this.nama + ", Gaji pokok : " + this.gajiPokok);
	}
}
