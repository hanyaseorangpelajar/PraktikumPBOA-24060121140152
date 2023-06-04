import java.util.HashMap;
import java.util.Map;

/**
 * Nama: Adri Audifirst
 * Tanggal: 4 Juni 2023
 * File: LambdaList.java
 * Deskripsi: Implementasi lambda pada List, digunakan untuk menampilkan key dan value dari sebuah Map.
*/

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("NIM001", "Adi");
        mahasiswaMap.put("NIM002", "Bambang");
        mahasiswaMap.put("NIM003", "Cici");
        mahasiswaMap.put("NIM004", "Didi");

        // Menampilkan key dan value menggunakan ekspresi lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
