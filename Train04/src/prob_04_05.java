import java.util.Scanner;

public class prob_04_05 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d번째 짝수 정수 입력 : ", i);
            num[i] = data.nextInt();
            if((double)num[i]%2 != 0){
                System.out.println("짝수를 입력해주세요.");
                i--;
            }
        }
        System.out.println();
        System.out.printf("Reverse Array = [ ");
        for (int j = 9; j > 0; j--){
            System.out.printf("%d ", num[j]);
        }
        System.out.printf("]\n");
    }
}
