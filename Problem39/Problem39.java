import java.util.*;

public class Problem39 {
    public static void main(String[] args) {

        int h1, m1, s1, h2, m2, s2;

        Scanner scanner = new Scanner(System.in);
        h1 = scanner.nextInt();
        m1 = scanner.nextInt();
        s1 = scanner.nextInt();
        h2 = scanner.nextInt();
        m2 = scanner.nextInt();
        s2 = scanner.nextInt();
        scanner.close();

        int difference = 3600 * (h2 - h1) + 60 * (m2 - m1) + (s2 - s1);
        int diffH = difference / 3600;
        difference -= diffH * 3600;
        int diffM = difference / 60;
        difference -= diffM * 60;

        System.out.printf("%d %d %d", diffH, diffM, difference);
    }
}
