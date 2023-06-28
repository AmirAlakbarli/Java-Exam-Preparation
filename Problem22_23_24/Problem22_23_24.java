import java.util.*;

public class Problem22_23_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sumOfNegativeEven = 0;
        int countOfNegativeEven = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double number = scanner.nextDouble();
                if (number < 0 && number % 2 == 0) {
                    countOfNegativeEven++;
                    sumOfNegativeEven += number;
                }
            }
        }
        scanner.close();

        System.out.print(countOfNegativeEven + " ");
        System.out.print(Math.floor(sumOfNegativeEven) == sumOfNegativeEven ? String.format("%.0f", sumOfNegativeEven)
                : sumOfNegativeEven);
    }
}
