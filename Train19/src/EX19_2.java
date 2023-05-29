import java.util.ArrayList;
import java.util.List;
import java.lang.*;

class ScoreCalculator{
    int each_score;
    List<Integer> scores;
    int sum_score;
    ScoreCalculator(){
        scores = new ArrayList<Integer>();
        sum_score = 0;
    }

    public void addScore(int each_score) {
        if (each_score < 0){
            throw new IllegalArgumentException();
        }
        scores.add(each_score);
        sum_score += each_score;
    }

    int calculateTotalScore(){
        return sum_score;
    }
}

public class EX19_2 {
    public static void main(String[] args) {
        ScoreCalculator calculator = new ScoreCalculator();

        calculator.addScore(80);
        calculator.addScore(-10); // 음수인 경우 예외 발생
        calculator.addScore(90);
        calculator.addScore(75);

        int totalScore = calculator.calculateTotalScore();
        System.out.println("Total Score : " + totalScore);
    }
}
