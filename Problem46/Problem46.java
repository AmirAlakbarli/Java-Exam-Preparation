import java.util.*;

public class Problem46 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int numOfSquare = (int) Math.floor(Math.sqrt(b)) - (int) Math.ceil(Math.sqrt(a)) + 1;
            if (numOfSquare > 0)
                res.add(numOfSquare);
            else
                res.add(0);

        }
        scanner.close();

        for (int i : res)
            System.out.println(i);
    }
}
