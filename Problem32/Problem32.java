import java.util.*;

public class Problem32{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();

        String[] integerStrings = inputLine.split(" ");
        int[] numbers = Arrays.stream(integerStrings).mapToInt(Integer::parseInt).toArray();

        int temp = numbers[0];
        for (int i = 1; i < numbers.length - 1; i++) {
            temp = temp + numbers[i] + numbers[i + 1];
            numbers[i] = temp - numbers[i];
            temp -= numbers[i];
        }

        for (int n : numbers)
            System.out.print(n + " ");
    }
}
