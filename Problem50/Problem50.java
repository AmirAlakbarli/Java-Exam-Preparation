import java.util.*;

public class Problem50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String revStr = new StringBuilder(str).reverse().toString();

        System.out.println(str.equals(revStr) ? "Yes" : "No");
    }
}
