import java.util.*;

public class Problem35_36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        scanner.close();

        String resultWithOdd = "";
        String resultWithEven = "";

        for (int i = 0; i < number.length(); i++) {
            if (Character.valueOf(number.charAt(i)) % 2 == 0)
                resultWithEven += number.charAt(i);
            else
                resultWithOdd += number.charAt(i);
        }

        System.out.println(resultWithOdd == "" ? 0 : resultWithOdd);
        System.out.println(resultWithEven == "" ? 0 : resultWithEven);

    }
}
