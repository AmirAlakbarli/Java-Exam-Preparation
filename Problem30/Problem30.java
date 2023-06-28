import java.util.*;

public class Problem30 {

    public static boolean hasSameDigit(int number) {
        String numberString = String.valueOf(number);
        int length = numberString.length();
        for (int i = 0; i < length; i++) {
            int digit = numberString.charAt(i);

            for (int j = i + 1; j < length; j++) {
                if (numberString.charAt(j) == digit)
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(hasSameDigit(n) ? "YES" : "NO");

    }
}
