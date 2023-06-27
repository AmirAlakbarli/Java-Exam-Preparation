import java.util.*;

public class Problem19_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> greaterThanPrevious = new ArrayList<>();
        ArrayList<Integer> greaterThanNext = new ArrayList<>();

        int previousNumber = 0, nextNumber = 0;

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (i == 0) {
                previousNumber = number;
            } else {
                nextNumber = number;
                if (nextNumber > previousNumber)
                    greaterThanPrevious.add(number);
                else if (nextNumber < previousNumber)
                    greaterThanNext.add(previousNumber);

                previousNumber = number;
            }
        }
        scanner.close();

        for (int i : greaterThanPrevious)
            System.out.print(i + " ");

        System.out.println();

        for (int i : greaterThanNext)
            System.out.print(i + " ");

    }
}
