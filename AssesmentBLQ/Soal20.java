import java.util.Scanner;

public class Soal20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak awal antara pemain A dan B: ");
        int jarakAwal = scanner.nextInt();

        int posisiA = 0;
        int posisiB = jarakAwal;

        while (posisiA < posisiB - 1) {
            System.out.println("Pemain A, pilih Gunting (G), Batu (B), atau Kertas (K): ");
            String pilihanA = scanner.next().toUpperCase();

            System.out.println("Pemain B, pilih Gunting (G), Batu (B), atau Kertas (K): ");
            String pilihanB = scanner.next().toUpperCase();

            System.out.println("A: " + pilihanA);
            System.out.println("B: " + pilihanB);

            if (isAWin(pilihanA, pilihanB)) {
                posisiA += 2;
            } else {
                posisiB -= 1;
            }

            System.out.println("Posisi A: " + posisiA);
            System.out.println("Posisi B: " + posisiB);
            System.out.println("------------------------");
        }

        if (posisiA > posisiB) {
            System.out.println("Pemain A adalah pemenang!");
        } else {
            System.out.println("Pemain B adalah pemenang!");
        }

        scanner.close();
    }

    static boolean isAWin(String pilihanA, String pilihanB) {
        return (pilihanA.equals("G") && pilihanB.equals("K")) ||
               (pilihanA.equals("B") && pilihanB.equals("G")) ||
               (pilihanA.equals("K") && pilihanB.equals("B"));
    }
}
