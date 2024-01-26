import java.util.HashMap;

public class Soal18 {
    public static void main(String[] args) {
        // Inisialisasi jam makan dan kalori dari kue
        HashMap<Integer, Integer> makanan = new HashMap<>();
        makanan.put(9, 30);
        makanan.put(13, 20);
        makanan.put(15, 50);
        makanan.put(17, 80);

        // Waktu mulai olahraga Donna
        int waktuMulaiOlahraga = 18;

        // Hitung total kalori dan waktu olahraga
        int totalKalori = 0;
        double totalWaktuOlahraga = 0;

        for (int jam : makanan.keySet()) {
            if (jam <= waktuMulaiOlahraga) {
                totalKalori += makanan.get(jam);
                totalWaktuOlahraga += 0.1 * makanan.get(jam);
            }
        }

        // Hitung jumlah air yang diminum Donna
        double airSelamaOlahraga = totalWaktuOlahraga / 2; // 100 cc per 30 menit
        double airAkhirOlahraga = 500; // 500 cc di akhir olahraga

        // Total air yang diminum Donna
        double totalAir = airSelamaOlahraga + airAkhirOlahraga;

        System.out.println("Donna akan meminum " + totalAir + " cc air selama berolahraga.");
    }
}
