import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.lang.Object;

public class EX11_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("수식을 입력하세요: ");
        String input = scanner.nextLine();

        // 공백 제거
        input = input.replaceAll("\\s+", "");

        // 입력된 수식 출력
        System.out.println("입력된 수식: " + input);

        double result = 0.0;

        // 사용법 체크
        StringTokenizer tokenizer = new StringTokenizer(input, "+-*/", true);

        ArrayList<String> tokens = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            tokens.add(tokenizer.nextToken());
        }

        for (String each_token : tokens) {
            System.out.println(each_token);
        }

        // todo: 1. { 3, +, 24, -, 2} 로 구성된 리스트로 곱셈과 나눗셈과 관련된 항 모두 처리
        for (int i = 0; i < tokens.size(); i++) {
            String token = tokens.get(i);
            if (token.equals("*") || token.equals("/")) {
                double num1 = Double.parseDouble(tokens.get(i - 1));
                double num2 = Double.parseDouble(tokens.get(i + 1));
                double result_num = calculate(num1, num2, token.charAt(0));
                tokens.set(i, Double.toString(result_num));
                tokens.remove(i - 1);
                tokens.remove(i);
                i -= 2;
            }
        }


        // todo: 2 { 3, +, 24, -, 2} 로 구성된 리스트로 +, - 연산 수행
        result = Double.parseDouble(tokens.get(0));
        for (int i = 1; i < tokens.size(); i += 2) {
            String op = tokens.get(i);
            double num = Double.parseDouble(tokens.get(i + 1));
            result = calculate(result, num, op.charAt(0));
        }

        // 최종 결과 출력
        System.out.println("계산 결과: " + result);
    }

    private static double calculate(double num1, double num2, char op) {
        double result = 0.0;
        if (op == '+' || op == '-') {
            result = num1 + (op == '+' ? 1 : -1) * num2;
        } else if (op == '*' || op == '/') {
            // 우선순위에 따라 계산 수행
            switch (op) {
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
            }
        }
        return result;
    }

}
