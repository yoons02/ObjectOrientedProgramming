import java.util.Random;
import java.util.Scanner;

class Dice{
    int n;
    Dice(int n){
        this.n = n;
    }
    int rand(){
        int number = (int)(Math.random() * n) + 1;
        return number;
    }
}

public class prob_05_04 {
    public static void main(String[] args) {
        int sum = 0;

        Scanner data = new Scanner(System.in);
        System.out.printf("주사위 면 수 n을 입력하세요 : ");
        int n = data.nextInt();
        Dice Obj = new Dice(n);
        int[] sum_re = new int[n];

        int[] result = new int[100];
        for (int i = 0; i < 100; i++){
            result[i] = Obj.rand();
            for (int j = 0; j < n; j++){
                sum += result[i];
            }
        }
        for (int i = 0; i < 100; i++){
            for (int j = 0; j < n; j++){
                if (result[i] == j+1){
                    sum_re[j]++;
                }
            }
        }
        System.out.printf("sum is %d\n", sum);
        for (int i = 0; i < n; i++){
            System.out.printf("count %d number is %d\n", i+1, sum_re[i]);
        }
    }
}
