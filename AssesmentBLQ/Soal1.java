import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soal1{
    public static List<Integer> kalkulasiMaximalCost(int[]item, int budget){
        int n = item.length;
        int[][] dp = new int[n + 1][budget + 1];

        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= budget; j++){
                if(item[i - 1] <= j){
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - item[i - 1]] + item[i - 1]);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        int i = n, j = budget;
        while(i > 0 && j > 0){
            if(dp[i][j] != dp[i - 1][j]){
                result.add(item[i - 1]);
                j -= item[i - 1];
            }
            i--;
        }
        return result;
    }

    public static void main(String[] args) {
        int uangAndi = 1000;
        int[] allItem = {500, 600, 700, 800, 200, 400, 350, 400, 350, 200, 300, 100, 50, 150};

        List<Integer> hasilKalkulasi = kalkulasiMaximalCost(allItem, uangAndi);

        int jumlahItem = hasilKalkulasi.size();
        System.out.println("Jumlah uang yang dipakai: " + uangAndi);
        System.out.println("Jumlah item yang bisa dibeli: " + jumlahItem);
        System.out.println("Kombinasi item: " + Arrays.toString(hasilKalkulasi.toArray()));
    }
}