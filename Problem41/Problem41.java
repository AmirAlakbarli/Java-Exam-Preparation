import java.util.*;

public class Problem41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> candles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int hgt = scanner.nextInt();
            candles.add(hgt);
        }
        scanner.close();

        int max = Collections.max(candles);
        int frequency = Collections.frequency(candles, max);

        System.out.println(frequency);
    }
}
