import java.util.*;

public class Problem8 {

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
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> ArmstrongIntegers = new ArrayList<>();

        for (int i = a; i <= b; i++) {
            if (isArmstrong(i))
                ArmstrongIntegers.add(i);
        }

        for (int number : ArmstrongIntegers)
            System.out.print(number + " ");
    }
}
