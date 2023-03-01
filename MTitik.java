/*
	MTitik.java  22/02/2023
	Nama : Adri Audifirst
	NIM  : 24060121140152
	Deskripsi : main untuk kelas titik
*/
class MTitik{
	public static void main(String[] args){
		Titik t1,t2, t3;
		t1 = new Titik();t1.setAbsis(1);t1.setOrdinat(9);
		t2 = new Titik();t2.setAbsis(6);t2.setOrdinat(7);
		t3 = new Titik(2,8);
		
		System.out.println("jumlah objek titik : "+t1.getCounterTitik());
		System.out.println("t1("+t1.getAbsis()+", "+t1.getOrdinat()+")");
		System.out.println("t2("+t2.getAbsis()+", "+t2.getOrdinat()+")");
		System.out.println("t3( "+t3.getAbsis()+", "+t3.getOrdinat()+")");
	}
}