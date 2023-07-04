import java.util.*;

public class Problem52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<>();
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int num = scanner.nextInt();
            scanner.nextLine();
            phoneBook.put(name, num);
        }

        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            Integer number = phoneBook.get(s);
            System.out.println(number != null ? s + "=" + number : "Not found");
        }
    }
}