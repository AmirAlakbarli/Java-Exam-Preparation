import java.util.*;

public class Problem21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        int length = text.length(), firstIndex = -1, lastIndex = -1;
        for (int i = 0; i < length; i++) {
            if (firstIndex == -1 && text.charAt(i) == 'f')
                firstIndex = i;
            if (lastIndex == -1 && text.charAt(length - 1 - i) == 'f')
                lastIndex = length - 1 - i;
            if (firstIndex != -1 && lastIndex != -1)
                break;
        }

        if (firstIndex == lastIndex)
            System.out.print(firstIndex != -1 ? firstIndex : "");
        else
            System.out.printf("%s %s", firstIndex != -1 ? String.valueOf(firstIndex) : "",
                    lastIndex != -1 ? String.valueOf(lastIndex) : "");

    }
}
