import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Soal7 {
     public static void main(String[] args) {
        int[] deret = {8, 7, 0, 2, 7, 1, 7, 6, 3, 0, 7, 1, 3, 4, 6, 1, 6, 4, 3};

        double mean = hitungMean(deret);
        int median = hitungMedian(deret);
        int[] modus = hitungModus(deret);

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Modus: " + Arrays.toString(modus));
    }

    // Fungsi untuk menghitung mean
    static double hitungMean(int[] deret) {
        int jumlah = 0;

        for (int angka : deret) {
            jumlah += angka;
        }

        return (double) jumlah / deret.length;
    }

    // Fungsi untuk menghitung median
    static int hitungMedian(int[] deret) {
        Arrays.sort(deret);

        int panjang = deret.length;

        if (panjang % 2 == 0) {
            // Jika panjang deret genap, median adalah rata-rata dua angka tengah
            int tengah1 = deret[panjang / 2 - 1];
            int tengah2 = deret[panjang / 2];
            return (tengah1 + tengah2) / 2;
        } else {
            // Jika panjang deret ganjil, median adalah angka tengah
            return deret[panjang / 2];
        }
    }

    // Fungsi untuk menghitung modus
    static int[] hitungModus(int[] deret) {
        Map<Integer, Integer> frekuensi = new HashMap<>();

        // Menghitung frekuensi setiap angka dalam deret
        for (int angka : deret) {
            frekuensi.put(angka, frekuensi.getOrDefault(angka, 0) + 1);
        }

        // Mencari nilai maksimum dari frekuensi
        int maksFrekuensi = 0;
        for (int frek : frekuensi.values()) {
            maksFrekuensi = Math.max(maksFrekuensi, frek);
        }

        // Memeriksa angka-angka yang memiliki frekuensi maksimum
        int jumlahModus = 0;
        for (int angka : frekuensi.keySet()) {
            if (frekuensi.get(angka) == maksFrekuensi) {
                jumlahModus++;
            }
        }

        // Membuat array untuk menyimpan modus
        int[] modus = new int[jumlahModus];
        int index = 0;
        for (int angka : frekuensi.keySet()) {
            if (frekuensi.get(angka) == maksFrekuensi) {
                modus[index++] = angka;
            }
        }

        return modus;
    }
    
}
