import java.util.*;

public class Problem33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();

        String[] integerStrings = inputLine.split(" ");
        int[] numbers = Arrays.stream(integerStrings).mapToInt(Integer::parseInt).toArray();
        int length = numbers.length;

        int prev = numbers[0];
        for (int i = 1; i < length - 1; i++) {
            int curr = numbers[i];
            numbers[i] = prev * numbers[i + 1];
            prev = curr;
        }

        for (int n : numbers)
            System.out.print(n + " ");
    }
}
