/*
 * File			: Manajer.java
 * Nama Pembuat : Adri Audifirst
 * NIM			: 24060121140152
 * Deskripsi 	: Program kelas child Manajer
 * Tanggal		: 14 Mei 2023
*/

public class Manajer extends Pegawai {
	private int tunjangan = 700000;
	
	public Manajer(String nama) {
		setNama(nama);
	}
	
	//Override
	public void tampilData() {
		super.tampilData();
		System.out.println("Tunjangan : " + this.tunjangan);
	}
}
