import java.util.Scanner;

public class Soal15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input (hh:mm:ss AM/PM): ");
        String input = scanner.nextLine();
        convertAndPrint24Format(input);
        scanner.close();
    }

    static void convertAndPrint24Format(String input) {
        int h1 = (int) input.charAt(1) - '0';
        int h2 = (int) input.charAt(0) - '0';
        int hour = (h2 * 10 + h1 % 10);

        if (input.charAt(8) == 'A') {
            if (hour == 12) {
                System.out.print("00");
            } else {
                System.out.print(input.substring(0, 8));
            }
        } else {
            if (hour == 12) {
                System.out.print("12");
            } else {
                hour = hour + 12;
                System.out.print(String.format("%02d", hour));
            }
        }

        System.out.println(input.substring(2, 8));
    }
}
