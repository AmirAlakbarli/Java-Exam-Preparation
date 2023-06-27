import java.util.*;

public class Problem13 {

    public static boolean areDigitsUnique(int number) {
        String numberString = String.valueOf(number);
        int length = numberString.length();

        for (int i = 0; i < length - 1; i++) {
            char digit = numberString.charAt(i);

            for (int j = i + 1; j < length; j++) {
                if (digit == numberString.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        for (int i = a; i <= b; i++) {
            if (areDigitsUnique(i))
                System.out.print(i + " ");
        }
    }
}