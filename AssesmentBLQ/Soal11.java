import java.util.Scanner;

public class Soal11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        inversePrint(input);

        scanner.close();
    }

    private static String[] caseInversePrint(String input) {
        String[] result = new String[input.length()];
        String pattern = "***";

        for (int i = 0; i < input.length(); i++) {
            result[i] = pattern + input.charAt(input.length() - i - 1) + pattern;
        }

        return result;
    }

    public static void inversePrint(String input) {
        String[] invertedStrings = caseInversePrint(input);

        for (String invertedString : invertedStrings) {
            System.out.println(invertedString);
        }
    }
}
