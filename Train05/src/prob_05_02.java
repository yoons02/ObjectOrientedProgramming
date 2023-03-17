import java.util.Scanner;

public class prob_05_02 {
    public static void main(String[] args) {
        System.out.printf("이름 입력 : ");
        Scanner data = new Scanner(System.in);
        String name = data.nextLine();
        System.out.printf("성이 몇 글자 입니까? >> ");
        int num = data.nextInt();

        String last = name.substring(0, num);
        String first = name.substring(num);

        System.out.printf("성 : %s\n", last);
        System.out.printf("이름 : %s\n", first);

    }
}
