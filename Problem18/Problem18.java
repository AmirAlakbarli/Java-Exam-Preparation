import java.util.*;

public class Problem18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        String[] integerStrings = inputLine.split(" ");
        int[] numbers = Arrays.stream(integerStrings).mapToInt(Integer::parseInt).toArray();

        int newNumber = scanner.nextInt();
        scanner.close();

        int length = numbers.length;
        int i;

        for (i = 0; i < length; i++) {
            if (newNumber > numbers[i]) {
                break;
            }
        }

        System.out.println(i);

    }
}
