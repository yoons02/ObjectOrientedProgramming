import java.util.ArrayList;
import java.lang.Character;

class NumberExtractor {
    public static ArrayList<Integer> extractNumbers(String str) {
        ArrayList<Integer> result = new ArrayList<>();
        int num = 0;
        boolean isNum = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
                isNum = true;
            } else {
                if (isNum) {
                    result.add(num);
                    num = 0;
                    isNum = false;
                }
            }
        }
        if (isNum) { // 숫자가 마지막에 올 때 result에 추가함
            result.add(num);
        }
        return result;
    }
}

public class EX12_4 {
    public static void main(String[] args) {
        String str = "I am going to climb mountin to walk 145km and it would take more than 2 hours and 35 minutes";
        ArrayList<Integer> numbers = NumberExtractor.extractNumbers(str);
        System.out.println("Numbers in \"" + str + "\": " + numbers);
    }
}
