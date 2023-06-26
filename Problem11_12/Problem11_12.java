import java.util.*;

public class Problem11_12 {

    public static boolean isPrime(int n) {
        boolean result = true;
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    // public
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int count = 0;
        int sum = 0;
        boolean flag = true;
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        if (a <= 2) {
            if (b >= 3) {
                Integer[] firstNums = { 2, 3 };
                count = 2;
                sum = 5;
                primeNumbers.addAll(Arrays.asList(firstNums));
                a = 5;
            } else {
                primeNumbers.add(2);
                count = 1;
                sum = 2;
            }
        } else if (a <= 3) {
            primeNumbers.add(3);
            count = 1;
            sum = 3;
            a = 5;
        } else {
            if (a % 6 == 0) {
                a = a / 6 * 6 + 1;
                flag = false;
            } else if (a % 6 > 1) {
                a = a / 6 * 6 + 5;
            }

        }

        while (a <= b) {
            if (isPrime(a)) {
                primeNumbers.add(a);
                count++;
                sum += a;
            }

            if (flag) {
                a += 2;
                flag = false;
            } else {
                a += 4;
                flag = true;
            }
        }

        System.out.printf("Count of primes: %d, Sum of primes: %d\n", count, sum);
        System.out.println("Mean of primes: " + (double) sum / count);
    }
}