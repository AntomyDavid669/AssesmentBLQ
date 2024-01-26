public class Soal8 {
    public static void main(String[] args) {
        int[] deret = {1, 2, 4, 7, 8, 6, 9};

        int[] hasil = hitungMinMaxSum(deret);

        System.out.println("Nilai Minimal: " + hasil[0]);
        System.out.println("Nilai Maksimal: " + hasil[1]);
    }

    // Fungsi untuk menghitung nilai minimal dan maksimal dari penjumlahan 4 komponen deret
    static int[] hitungMinMaxSum(int[] deret) {
        if (deret.length < 4) {
            throw new IllegalArgumentException("Deret harus memiliki minimal 4 komponen");
        }

        // Mengurutkan deret secara ascending
        java.util.Arrays.sort(deret);

        int minimal = 0;
        int maksimal = 0;

        // Menghitung nilai minimal dengan menjumlahkan 4 komponen pertama
        for (int i = 0; i < 4; i++) {
            minimal += deret[i];
        }

        // Menghitung nilai maksimal dengan menjumlahkan 4 komponen terakhir
        for (int i = deret.length - 4; i < deret.length; i++) {
            maksimal += deret[i];
        }

        int[] hasil = {minimal, maksimal};
        return hasil;
    }
    
}
