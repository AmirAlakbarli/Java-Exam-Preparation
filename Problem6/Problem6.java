import java.util.*;

public class Problem6 {

    public static int sumOfDigit(int n) {
        int sum = 0;
        do {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        } while (n > 0);

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> resultNumbers = new ArrayList<>();
        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            if (sumOfDigit(i) == s)
                resultNumbers.add(i);
        }

        for (int number : resultNumbers)
            System.out.println(number);
    }
}
