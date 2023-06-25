import java.util.*;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0)
            number *= (-1);

        int digitCheck = scanner.nextInt();
        scanner.close();

        int count = 0;
        do {
            int digit = number % 10;
            if (digit == digitCheck)
                count++;
            number /= 10;
        } while (number > 0);

        System.out.println(count);
    }
}