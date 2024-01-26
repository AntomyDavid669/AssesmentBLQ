import java.util.Scanner;

public class Soal10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String input = scanner.nextLine();

        nameCensoring(input);

        scanner.close();
    }

    private static String[] caseNameCensoring(String input) {
        String[] words = convertToArrayString(input);
        String[] result = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            result[i] = maskWord(currentWord);
        }

        return result;
    }

    private static String[] convertToArrayString(String input) {
        return input.split(" ");
    }

    private static String maskWord(String word) {
        int wordLength = word.length();
        return word.substring(0, 1) + "***" + word.substring(wordLength - 1);
    }

    public static void nameCensoring(String input) {
        String[] censoredWords = caseNameCensoring(input);

        for (String word : censoredWords) {
            System.out.print(word + " ");
        }
    }
}
