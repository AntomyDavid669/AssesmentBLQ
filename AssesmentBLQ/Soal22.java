public class Soal22 {
    public static void main(String[] args) {
        int[] inputArray = {3, 3, 9, 6, 7, 8, 23};
        System.out.println(findFirstMeltedCandle(inputArray));
    }

    public static int findFirstMeltedCandle(int[] candleLengths) {
        int result = 0;
        int[] tempDifference = new int[candleLengths.length];
        int[] fibonacciSequence = {1, 1, 2, 3, 5, 8, 13};

        for (int i = 0; i < candleLengths.length; i++) {
            tempDifference[i] = candleLengths[i] - fibonacciSequence[i];
        }

        for (int i = 0; i < tempDifference.length; i++) {
            if (tempDifference[i] <= 0) {
                result = candleLengths[i];
            }
        }

        return result;
    }
}
