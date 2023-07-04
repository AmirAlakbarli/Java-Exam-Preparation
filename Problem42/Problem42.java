import java.util.*;

public class Problem42 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int v2 = scanner.nextInt();
        scanner.close();

        String res = "NO";

        if (v1 == v2) {
            if (x1 == x2)
                res = "YES";
        } else {
            double div = ((double) x1 - x2) / (v2 - v1);
            if (div == (int) div && div > 0)
                res = "YES";
        }

        System.out.println(res);
    }
}
