/*
	Nama Program	:Titik.java  01/03/2023
	Nama 			: Adri Audifirst
	NIM  			: 24060121140152
	Deskripsi 		: kelas untuk titik
*/

 class OperasiTitik{
	 private void refleksiSumbuX(Titik titik){
		titik.setOrdinat((titik.getOrdinat())*-1);
	 }
	 
	 private void refleksiSumbuY(Titik titik){
		titik.setAbsis((titik.getAbsis())*-1);
	 }
	 
	 public void refleksiX(Titik t){
		refleksiSumbuX(t);
	 }
	 
	 public void refleksiY(Titik t){
		refleksiSumbuY(t);
	 }
	 
 }