import java.util.*;

public class Problem31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int length = (int) Math.floor(Math.log10(number)) + 1;
        int power = length - 1;
        int decimals = power - 1;
        int result = 0;
        boolean flag = false;

        for (int i = 0; i < length; i++) {
            int digit = (number / ((int) Math.pow(10, power))) % 10;
            if (power > 0 && digit < (number / ((int) Math.pow(10, power - 1))) % 10 && !flag) {
                flag = true;
                power--;
                continue;
            }
            result += digit * Math.pow(10, decimals);
            decimals--;
            power--;
        }
        System.out.println(result);

    }
}
