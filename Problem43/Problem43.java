import java.util.*;

public class Problem43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++)
            nums.add(scanner.nextInt());

        int countOfOper = scanner.nextInt();
        
        for (int i = 0; i < countOfOper; i++) {
            String oper = scanner.next();
            if (oper.equals("Insert")) {
                int newIndex = scanner.nextInt();
                int newVal = scanner.nextInt();
                nums.add(newIndex, newVal);
            } else if (oper.equals("Delete")) {
                int deletedIndex = scanner.nextInt();
                nums.remove(deletedIndex);
            }
        }

        scanner.close();

        for (int i : nums)
            System.out.print(i + " ");
    }
}
