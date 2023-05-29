import java.util.ArrayList;
import java.util.List;
import java.lang.*;

class NegativeScoreException extends Exception{
    public String getMessage(){
        return ("Score cannot be negative");
    }
}
class ScoreCalculator3{
    int each_score;
    List<Integer> scores;
    int sum_score;
    ScoreCalculator3(){
        scores = new ArrayList<Integer>();
        sum_score = 0;
    }

    public void addScore(int each_score) throws NegativeScoreException {
        if (each_score < 0){
            throw new NegativeScoreException();
        }
        scores.add(each_score);
        sum_score += each_score;
    }

    int calculateTotalScore(){
        return sum_score;
    }
}

public class EX19_3 {
    public static void main(String[] args) {
        ScoreCalculator3 calculator = new ScoreCalculator3();

        try {
            calculator.addScore(85);
            calculator.addScore(90); // 음수인 경우 예외 발생
            calculator.addScore(-10);
            calculator.addScore(75);
        }catch (NegativeScoreException e){
            System.out.println("Exception caught : " + e.getMessage());
        }

        int totalScore = calculator.calculateTotalScore();
        System.out.println("Total Score : " + totalScore);
    }
}
