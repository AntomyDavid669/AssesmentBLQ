import java.util.Scanner;

public class Soal5 {
     // Fungsi untuk menghasilkan deret Fibonacci
    static void displayFibonacci(int n) {
        int first = 0, second = 1;

        System.out.print("Deret Fibonacci pertama " + n + " bilangan adalah: ");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n untuk deret Fibonacci: ");
        int n = scanner.nextInt();

        displayFibonacci(n);

        // Tutup scanner setelah digunakan
        scanner.close();
    }
}
