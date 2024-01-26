import java.util.Scanner;

public class Soal19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.println("Kalimat adalah pangram: " + isPangram(kalimat));

        scanner.close();
    }

    static boolean isPangram(String kalimat) {
        kalimat = kalimat.toLowerCase();

        boolean[] hurufAda = new boolean[26];

        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);

            if (Character.isLetter(karakter)) {
                int indeks = karakter - 'a';
                hurufAda[indeks] = true;
            }
        }
        for (boolean ada : hurufAda) {
            if (!ada) {
                return false;
            }
        }

        return true;
    }
}
