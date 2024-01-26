import java.util.Scanner;

public class Soal12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        System.out.print("Output: ");
        sortNumbers(input);

        scanner.close();
    }

    static void sortNumbers(String input) {
        // Membagi input menjadi token dengan spasi sebagai pemisah
        String[] tokens = input.split(" ");

        // Mengonversi token menjadi array integer
        int[] numbers = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]);
        }

        // Algoritma pengurutan tanpa menggunakan fungsi sort
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    // Tukar nilai jika urutan tidak benar
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        // Mencetak hasil pengurutan
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
