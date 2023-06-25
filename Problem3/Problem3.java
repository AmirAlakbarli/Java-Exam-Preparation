import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        List<Integer> numbersWithDifferentDigits = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            int decimals = i % 10;
            int hundredths = (i / 10) % 10;
            int thousandths = (i / 100);
            if (decimals != hundredths && decimals != thousandths && hundredths != thousandths) {
                numbersWithDifferentDigits.add(i);
            }
        }
        
        for(int number: numbersWithDifferentDigits) System.out.println(number);

    }
}
