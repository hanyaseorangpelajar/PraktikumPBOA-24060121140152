/*
 * File			: Programmer.java
 * Nama Pembuat : Adri Audifirst
 * NIM			: 24060121140152
 * Deskripsi 	: Program kelas child Programmer
 * Tanggal		: 14 Mei 2023
*/

public class Programmer extends Pegawai {
	private int bonus = 450000;
	
	public Programmer(String nama) {
		setNama(nama);
	}
	
	//Override
	public void tampilData() {
		super.tampilData();
		System.out.println("Bonus : " + this.bonus);
	}
}