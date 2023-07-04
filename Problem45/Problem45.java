import java.util.*;

public class Problem45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> heights = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            heights.add(scanner.nextInt());
        }
        scanner.close();

        System.out.println(Collections.max(heights) - k > 0 ? Collections.max(heights) - k : 0);
    }
}
