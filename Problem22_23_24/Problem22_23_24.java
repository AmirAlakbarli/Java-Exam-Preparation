import java.util.*;

public class Problem22_23_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sumOfPositive = 0, productOfPositiveOdd = 1, sumOfNegativeEven = 0;
        int countOfNegativeEven = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double number = scanner.nextDouble();
                if (number > 0)
                    sumOfPositive += number;
                if (number % 2 == 1)
                    productOfPositiveOdd *= number;
                if (number < 0 && number % 2 == 0) {
                    countOfNegativeEven++;
                    sumOfNegativeEven += number;
                }
            }
        }
        scanner.close();

        System.out.println(
                Math.floor(sumOfPositive) == sumOfPositive ? String.format("%.0f", sumOfPositive) : sumOfPositive);

        System.out.println(
                Math.floor(productOfPositiveOdd) == productOfPositiveOdd ? String.format("%.0f", productOfPositiveOdd)
                        : productOfPositiveOdd);

        System.out.println("Count of Negative even number: " + countOfNegativeEven + "\t");

        System.out.println(
                Math.floor(sumOfNegativeEven) == sumOfNegativeEven ? String.format("%.0f", sumOfNegativeEven)
                        : sumOfNegativeEven);
    }
}
