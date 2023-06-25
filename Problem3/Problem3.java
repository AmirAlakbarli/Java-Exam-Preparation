import java.util.*;

public class Problem3 {

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

    public static boolean has5Digits(int number) {
        String numberString = String.valueOf(number);
        return numberString.length() == 5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        List<Integer> numbersWithDifferentDigits = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            if (has5Digits(i) && areDigitsUnique(i))
                numbersWithDifferentDigits.add(i);
        }

        for (int number : numbersWithDifferentDigits)
            System.out.println(number);

    }
}
