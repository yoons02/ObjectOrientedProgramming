package src;

import java.util.Scanner;

public class prob_03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 계산할 값을 입력하세요 : ");
        int first = sc.nextInt();
        System.out.print("두 번쨰 계산할 값을 입력하세요 : ");
        int second = sc.nextInt();
        System.out.printf("%d + %d = %d\n", first, second, first+second) ;
        System.out.printf("%d - %d = %d\n", first, second, first-second) ;
        System.out.printf("%d / %d = %d\n", first, second, first/second) ;
        System.out.printf("%d * %d = %d\n", first, second, first*second) ;
    }
}
