import java.util.*;

public class Problem28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int digitSquares = 0, digitCubes = 0;
        while (number > 0) {
            int digit = number % 10;
            digitSquares += (int) Math.pow(digit, 2);
            digitCubes += (int) Math.pow(digit, 3);
            number /= 10;
        }

        System.out.printf("Sum of squares of digits: %d\nSum of cubes of digits: %d", digitSquares, digitCubes);
    }
}
