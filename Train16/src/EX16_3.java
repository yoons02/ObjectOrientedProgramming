import java.util.HashMap;
import java.util.Scanner;
import java.lang.Character;

public class EX16_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }

        for (char c = 'a'; c <= 'z'; c++) {
            if (map.containsKey(c)) {
                System.out.println(c + " : " + map.get(c));
            }
        }
    }
}
