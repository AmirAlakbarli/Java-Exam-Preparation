import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> resultNumbers = new ArrayList<>();
        for (int i = 100; i < 1000; i++) {
            int decimals = i % 10;
            int hundredths = (i / 10) % 10;
            int thousandths = (i / 100);
            if (decimals + hundredths + thousandths == n)
                resultNumbers.add(i);
        }

        System.out.println(resultNumbers.size());

        for (int number : resultNumbers)
            System.out.println(number);
    }
}
