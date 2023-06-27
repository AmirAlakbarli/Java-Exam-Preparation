import java.util.*;

public class Problem16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < numberOfElements; i++) {
            numbers.add(scanner.nextInt());
        }
        scanner.close();

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == min)
                numbers.set(i, max);
            else if (numbers.get(i) == max)
                numbers.set(i, min);
        }

        for (int i : numbers)
            System.out.print(i + " ");
    }
}
