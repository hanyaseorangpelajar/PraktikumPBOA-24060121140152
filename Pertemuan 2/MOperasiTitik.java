/*
	Nama Program	: MOpearasiTitik.java  22/02/2023
	Nama 			: Adri Audifirst
	NIM  			: 24060121140152
	Deskripsi 		: program main kelas titik
*/
class MOperasiTitik{
	public static void main(String[] args){
		Titik t1;
		OperasiTitik ot;
		
		t1 = new Titik(5,1);
		ot = new OperasiTitik();
		
		System.out.println("titik koordinat awal ("+t1.getAbsis()+", "+t1.getOrdinat()+")");
		
		ot.refleksiX(t1);
	
		System.out.println("titik setelah refelksi tdp smb X: ("+t1.getAbsis()+", "+t1.getOrdinat()+")");
		
		ot.refleksiY(t1);
		
		System.out.println("titik setelah refelksi tdp smb y: ("+t1.getAbsis()+", "+t1.getOrdinat()+")");
	}
}
