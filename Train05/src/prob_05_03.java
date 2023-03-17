import java.util.Scanner;

public class prob_05_03 {
    public static void main(String[] args) {
        System.out.printf("str 입력 : ");
        Scanner data = new Scanner(System.in);
        String str = data.nextLine();

        String[] array = str.split(",");

        for (int line = 0; line < 3; line++) {
            for (int i = 3*line; i < 3*line+3; i++) {
                System.out.printf("%s ", array[i]);
            }
            System.out.println();
        }
    }
}
