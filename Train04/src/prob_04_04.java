import java.util.Scanner;

public class prob_04_04 {
    public static void main(String[] args) {
        System.out.printf("Input num : ");
        Scanner data = new Scanner(System.in);
        int num = data.nextInt();

        for(int i = 1; i < 2*num; i+=2) {
            for(int j = 1; j < i; j+=2) {
                System.out.print(" ");
            }
            for(int j = 2*num; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
