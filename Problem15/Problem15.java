import java.util.*;

public class Problem15 {

    public static long reverseNumber(long number) {
        long resultNumber = 0;

        do {
            resultNumber = resultNumber * 10 + number % 10;
            number /= 10;
        } while (number > 0);

        return resultNumber;
    }

    public static boolean isPolindrome(long number) {
        return number == reverseNumber(number);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();

        System.out.println(isPolindrome(n) ? "Yes" : "No");
    }
}