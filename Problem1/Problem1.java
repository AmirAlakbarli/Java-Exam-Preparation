import java.util.*;

public class Problem1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        scanner.close();

        List<Boolean> booleanList = new ArrayList<>(Collections.nCopies(10, false));
        int trueCount = 0;

        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            if (digit != -1) {
                if (!booleanList.get(digit)) {
                    booleanList.set(digit, true);
                    trueCount++;
                }
            }
        }

        System.out.println(10 - trueCount);

        for (int i = 0; i < booleanList.size(); i++) {
            if (!booleanList.get(i))
                System.out.print(i + " ");
        }

    }
}