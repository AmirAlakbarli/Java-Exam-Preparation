import java.util.*;

public class Problem48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = scanner.nextLong();
        long min = sum, max = sum;
        for (int i = 0; i < 4; i++) {
            long num = scanner.nextLong();
            sum += num;
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }
        scanner.close();
        System.out.printf("%d %d", sum - max, sum - min);

    }
}