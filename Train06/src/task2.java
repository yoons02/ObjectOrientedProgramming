import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Stu[] student = new Stu[2];
        Scanner data = new Scanner(System.in);

        for(int i = 0; i < 2; i++)
        {
            System.out.printf("%d\n학번 입력 : ",i+1);
            String number = data.nextLine();
            data.nextLine();
            System.out.printf("이름 입력 : ");
            String name = data.nextLine();
            data.nextLine();
            System.out.printf("점수 입력 : ");
            double score = data.nextDouble();
            data.nextLine();

            student[i] = new Stu(number, name, score);
            // 객체지향으로 바꿀 때 클래스 내에 만들어놓은 get 함수로 값을 받아주세요!
        }
        for (int j = 0; j < 2; j++){
            System.out.println("-------------------------");
            student[j].show();
        }
    }
}
class Stu {
    String number;
    String name;
    double score;

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
    public double getScore(){
        return score;
    }
    public Stu(String number, String name, double score){
        this.number = number;
        this.name = name;
        this.score = score;
    }
    public void show(){
        System.out.printf("학번 : %s\n", getNumber());
        System.out.printf("이름 : %s\n", getName());
        System.out.printf("점수 : %.2f\n", getScore());
    }
}

