import java.util.*;

public class Problem40 {

    public static int sumOfDigits(long n) {
        int sum = 0;
        do {
            sum += n % 10;
            n /= 10;
        } while (n > 0);

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        scanner.close();
        long count = 0;

        do {
            number -= sumOfDigits(number);
            count++;
        } while (number > 0);

        System.out.println(count);
    }
}
