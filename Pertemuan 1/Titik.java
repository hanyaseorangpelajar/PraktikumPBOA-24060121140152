/*
* Titik.java 22/02/23
* Penulis : Adri Audifirst
* Deskripsi : Kelas Titik
*/



class Titik {
    double absis, ordinat;
    static int counterTitik;
	
	Titik(double a, double b) {
		absis = a;
		ordinat = b;
		counterTitik++;
	}
	
    Titik() {
        absis = ordinat = 0;
        counterTitik++;
    }

    void setAbsis(double abs) {
        absis = abs;
    }
	
	void setOrdinat(double ord) {
		ordinat = ord;
	}
	
    double getAbsis() {
        return absis;
    }
	
	double getOrdinat() {
		return ordinat;
	}
	
	int getCounterTitik() {
		return counterTitik;
	}
	
	
}