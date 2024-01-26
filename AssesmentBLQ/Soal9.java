import java.util.Arrays;
import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        int input = inputInteger();
        printArray(series(input));
    }

    public static int inputInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }

    public static int[] series(int n) {
        int[] inputArray = new int[n];
        inputArray[0] = n;
        for (int i = 1; i < n; i++) {
            inputArray[i] = inputArray[i - 1] + n;
        }
        return inputArray;
    }

    public static void printArray(int[] arr) {
        System.out.print("Hasil deret: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
