import java.util.*;

public class Problem17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        ArrayList<Double> numbers = new ArrayList<>();
        int count = 0;
        double sum = 0;

        for (int i = 1; i <= numberOfElements; i++) {
            double number = scanner.nextDouble();
            numbers.add(number);
            if (i % 3 == 0 && number > 0) {
                count++;
                sum += number;
            }
        }

        scanner.close();
        System.out.printf("%d %.2f", count, sum);
    }
}