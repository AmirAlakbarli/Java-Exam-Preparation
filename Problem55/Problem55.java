import java.math.BigInteger;
import java.util.*;

public class Problem55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = new BigInteger(scanner.nextLine());
        scanner.close();
        boolean bool1 = n.isProbablePrime(1);
        System.out.println(bool1 ? "prime" : "not prime");
    }
}
