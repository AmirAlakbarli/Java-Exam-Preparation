import java.util.*;

public class Problem47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numOfZero = 0, numOfPos = 0, numOfNeg = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > 0)
                numOfPos++;
            else if (num < 0)
                numOfNeg++;
            else
                numOfZero++;
        }
        scanner.close();

        double totalSize = numOfZero + numOfPos + numOfNeg;

        System.out.printf("%.6f\n%.6f\n%.6f", numOfPos / totalSize, numOfNeg / totalSize, numOfZero / totalSize);
    }
}