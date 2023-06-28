import java.util.*;

public class Problem34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();

        int digit = (int) (n % 10), count = 0;
        while (n > 0) {
            if (n % 10 > digit) {
                digit = (int) (n % 10);
                count = 1;
            } else if (digit == n % 10)
                count++;

            n /= 10;
        }
        System.out.println(count);
    }
}
