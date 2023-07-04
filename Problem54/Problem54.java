import java.util.*;

public class Problem54 {

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] chArr = a.toCharArray();
        char[] chArr1 = b.toCharArray();

        Arrays.sort(chArr);
        Arrays.sort(chArr1);

        return Arrays.equals(chArr, chArr1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }
}
