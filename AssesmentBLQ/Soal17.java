public class Soal17 {
    public static void main(String[] args) {
        String jalur = "nntnnntttttnttttn";

        // Split the input string into an array of characters
        String[] arrJalur = jalur.split("");
        int gunung = 0;
        int lembah = 0;

        int init = 0;
        for (int i = 0; i < arrJalur.length; i++) {
            if (arrJalur[i].trim().equalsIgnoreCase("n")) {
                init++;
                if (init == 0) {
                    lembah++;
                }
            } else {
                init--;
                if (init == 0) {
                    gunung++;
                }
            }
        }

        // Output the results
        System.out.println("Number Gunung: " + gunung);
        System.out.println("Number Lembah: " + lembah);
    }
}
