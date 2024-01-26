import java.util.Scanner;

public class Soal4 {
     static boolean bilanganPrima(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Fungsi untuk menampilkan n bilangan prima pertama
    static void viewBilanganPrima(int n) {
        int count = 0;
        int num = 2;
        System.out.print(n + " bilangan prima pertama adalah: ");
        while (count < n) {
            if (bilanganPrima(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        viewBilanganPrima(n);

        // Tutup scanner setelah digunakan
        scanner.close();
    }
}
