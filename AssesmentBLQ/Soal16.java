public class Soal16 {
    public static void main(String[] args) {
    int[][] menu = { { 42000, 1 }, { 50000, 0 }, { 30000, 0 }, { 70000, 0 }, { 30000, 0 } };
    int totalPerson = 4;
    int allergicPerson = 1;

    splitBill(menu, totalPerson, allergicPerson);
}

private static float[] caseSplitBill(int[][] menu, int totalPerson, int allergicPerson) {
    float allergicBill = 0, nonAllergicBill = 0, allergicSum = 0, nonAllergicSum = 0;

    for (int i = 0; i < menu.length; i++) {
        float itemSum = countTaxAndService(menu[i][0]);
        if (menu[i][1] == 1) {
            allergicSum += itemSum;
        } else {
            nonAllergicSum += itemSum;
        }
    }

    allergicBill = nonAllergicSum / totalPerson;
    nonAllergicBill = allergicBill + (allergicSum / (totalPerson - allergicPerson));

    System.out.println("Allergic Bill: " + allergicBill);
    System.out.println("Non-Allergic Bill: " + nonAllergicBill);

    return new float[] { allergicBill, nonAllergicBill };
}

private static float countTaxAndService(int price) {
    return price + (price * 15 / 100);
}

public static void splitBill(int[][] menu, int totalPerson, int allergicPerson) {
    float[] bill = caseSplitBill(menu, totalPerson, allergicPerson);
    System.out.println("Bill for non-allergic: " + bill[1]);
    System.out.println("Bill for allergic: " + bill[0]);
}
}
