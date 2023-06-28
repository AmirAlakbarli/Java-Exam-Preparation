import java.util.*;

public class Problem29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        ArrayList<Integer> digits = new ArrayList<>();
        do {
            digits.add(number % 10);
            number /= 10;
        } while (number > 0);

        Collections.sort(digits);

        int decimal = 1;
        int res = 0;
        for (int i : digits) {
            res += (i * decimal);
            decimal *= 10;
        }

        System.out.println(res*res);

    }
}
