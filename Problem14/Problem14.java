import java.util.*;

public class Problem14 {

    public static boolean haveSameDigits(int number) {
        String numberString = String.valueOf(number);
        int length = numberString.length();

        for (int i = 0; i < length - 1; i++) {
            char digit = numberString.charAt(i);

            for (int j = i + 1; j < length; j++) {
                if (numberString.charAt(j) == digit)
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        for (int i = a; i <= b; i++) {
            if (haveSameDigits(i))
                System.out.print(i + " ");
        }
    }
}