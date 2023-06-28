import java.util.*;

public class Problem37_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int decimal = 1, resEven = 0, resOdd = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                resEven += (digit + 1) * decimal;
                resOdd += digit * decimal;
            } else {
                resEven += digit * decimal;
                if (n == 1)
                    resOdd += digit * decimal;
                else
                    resOdd += (digit - 1) * decimal;
            }
            digit++;
            decimal *= 10;
            n /= 10;
        }

        System.out.printf("Number with changed even digit: %d\nNumber with changed odd digits: %d", resEven, resOdd);
    }
}
