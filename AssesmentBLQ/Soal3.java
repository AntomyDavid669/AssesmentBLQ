import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Soal3 { 
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the end time (dd MMMM yyyy | HH:mm:ss): ");
        String Masuk  = scanner.nextLine();
        System.out.println("Enter the end time (dd MMMM yyyy | HH:mm:ss): ");
        String Keluar = scanner.nextLine();
        Tarif(Masuk, Keluar);
        scanner.close();
        }catch(DateTimeParseException e){
            System.out.println("Invalid date-time format. Please enter dates in the correct format.");
        }
    }

    private static long lamaParkir(String Masuk, String Keluar){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy | HH:mm:ss", new Locale("id"));
        LocalDateTime startDate = LocalDateTime.parse(Masuk, formatter);
        LocalDateTime endDate = LocalDateTime.parse(Keluar, formatter);

        return Duration.between(startDate, endDate).toHours();
    }

    private static double hitungKalkulasiParkir(long lamaParkir){
        double tariff = 0;

        if (lamaParkir <= 8) {
            tariff = lamaParkir * 1000;
        } else if (8 < lamaParkir && lamaParkir <= 24) {
            tariff = 8000;
        } else {
            tariff = 15000 + ((lamaParkir - 24) * 1000);
        }

        return tariff;
    }

    public static void Tarif(String Masuk, String Keluar){
        long lamaParkir = lamaParkir(Masuk, Keluar);
        System.out.println("=================================");
        System.out.println("Tariff: " + hitungKalkulasiParkir(lamaParkir));
    }
}
