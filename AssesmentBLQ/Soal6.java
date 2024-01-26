import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = scanner.nextLine();

        printIsPalindrome(kata);

        scanner.close();
    }

    // Fungsi untuk mengecek apakah sebuah kata adalah palindrome atau tidak
    static boolean isPalindrome(String kata) {
        // Mengubah kata menjadi huruf kecil untuk memperlakukan huruf besar dan kecil dengan sama
        kata = kata.toLowerCase();

        // Panjang kata
        int panjang = kata.length();

        // Memeriksa setiap karakter dari awal dan akhir kata
        for (int i = 0; i < panjang / 2; i++) {
            // Jika karakter tidak cocok, kata bukan palindrome
            if (kata.charAt(i) != kata.charAt(panjang - 1 - i)) {
                return false;
            }
        }

        // Jika semua karakter cocok, kata adalah palindrome
        return true;
    }

    // Fungsi untuk mencetak hasil pengecekan palindrome
    static void printIsPalindrome(String kata) {
        System.out.println("\"" + kata + "\" adalah palindrome: " + isPalindrome(kata));
    }
}
