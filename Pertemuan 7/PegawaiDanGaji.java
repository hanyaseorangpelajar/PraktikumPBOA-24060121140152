/*
 * File			: PegawaiDanGaji.java
 * Nama Pembuat : Adri Audifirst
 * NIM			: 24060121140152
 * Deskripsi 	: Program kelas main untuk implementasi Pegawai dan Payroll
 * Tanggal		: 14 Mei 2023
*/

public class PegawaiDanGaji {
	public static void main(String[] args) {
		Pegawai pegawai = new Programmer("Mira");
		Pegawai pegawai2 = new Manajer("Joko");
		Pegawai pegawai3 = new Manajer("Argo");
		
		Payroll payroll = new Payroll();
		payroll.cetakGaji(pegawai);
		payroll.cetakGaji(pegawai2);
		payroll.cetakGaji(pegawai3);
	}
}