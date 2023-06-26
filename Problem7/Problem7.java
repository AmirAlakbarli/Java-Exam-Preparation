import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int lastDigit = number % 10;
        number /= 10;
        String result = "YES";
        do {
            int digit = number % 10;
            if (lastDigit <= digit) {
                result = "NO";
                break;
            }
            lastDigit = digit;
            number /= 10;
        } while (number > 0);

        System.out.println(result);
    }
}
