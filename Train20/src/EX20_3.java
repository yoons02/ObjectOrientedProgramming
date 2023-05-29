
import java.time.LocalTime;
class MP3 {

    private String name;
    MP3(String name){
        this.name = name;
    }

    public void playSong() {
        System.out.println("let's play~" + name);
    }

}

interface TimeProvider {
    int getHour();
}

class RealTimeProvider implements TimeProvider {
    @Override
    public int getHour() {
        return LocalTime.now().getHour();
    }
}

class TestTimeProvider implements TimeProvider {
    private int TestHour;
    public TestTimeProvider(int TestHour) {
        this.TestHour = TestHour;
    }
    @Override
    public int getHour() {
        return TestHour;
    }
}


class TimeReminder {

    private MP3 mp3;
    private TimeProvider timeProvider;

    public TimeReminder(TimeProvider timeProvider){
        this.timeProvider = timeProvider;
    }

    public void reminder() {
        int currentHour = timeProvider.getHour();
        mp3 = new MP3("Yoons");

        if (currentHour >= 22) {
            mp3.playSong();
        }
    }
}

public class EX20_3{
    public static void main(String[] args) {
         TimeProvider realTimeProvider = new RealTimeProvider();
         TimeReminder timeReminder = new TimeReminder(realTimeProvider);
         timeReminder.reminder();

         TimeProvider testTimeProvider = new TestTimeProvider(22); // 22 is hourOfDay
         timeReminder = new TimeReminder(testTimeProvider);
         timeReminder.reminder();
    }
}
