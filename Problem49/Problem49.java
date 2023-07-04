import java.util.*;

public class Problem49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        Set<Integer> uniqueNums = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            nums.add(num);
            uniqueNums.add(num);
        }

        scanner.close();

        int res = 0;
        for (int i : uniqueNums) {
            if (Collections.frequency(nums, i) == 1)
                res = i;
        }

        System.out.println(res);

    }
}
