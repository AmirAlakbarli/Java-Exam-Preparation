import java.util.*;

public class Problem51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int negativeNumberCounter = 0;
        for (int i = 0; i < array.length; i++) {
            int currentSum = array[i];
            for (int j = i; j < array.length; j++) {
                if (i < j) {
                    currentSum += array[j];
                }

                if (currentSum < 0) {
                    negativeNumberCounter++;
                }
            }
        }
        System.out.println(negativeNumberCounter);
    }
}
