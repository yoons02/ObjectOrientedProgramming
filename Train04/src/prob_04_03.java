
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class prob_04_03 {
    public static void main(String[] args) {

        System.out.println("최대 공약수 구하기");
        System.out.print("숫자1입력 >> ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.print("숫자2입력 >> ");
        int num2 = sc.nextInt();

        int M = 0; //최대 공약수

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                M = i;
            }
        }
        System.out.println(M);
    }
}