import java.util.*;

public class Problem25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        for (int i = a; i <= b; i++) {
            System.out.print((long) Math.pow(i, 2) + " ");
        }

        System.out.println();

        for (int i = b; i >= a; i--) {
            System.out.print((long) Math.pow(i, 3) + " ");
        }

    }
}
