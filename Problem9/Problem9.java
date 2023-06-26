import java.util.*;

public class Problem9 {

    public static boolean isArmstrong(int n) {
        int tempN = n;
        int sum = 0;
        do {
            int digit = tempN % 10;
            sum += Math.pow(digit, 4);
            tempN /= 10;
        } while (tempN > 0);

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(isArmstrong(n) ? "YES" : "NO");
    }
}
