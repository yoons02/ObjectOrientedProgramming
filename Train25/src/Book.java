import java.util.ArrayList;
import java.util.Scanner;

abstract class Alarm {
    private final String name;
    private int type;

    public Alarm(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public abstract void sendNotification(String message);

    public String toString() {
        return String.format("%d:%s", type, name);
    }
}

class PhoneCall extends Alarm {
    public PhoneCall(String name) {
        super(name, 1);
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("전화로 알림 (to " + getName() + "): " + message);
    }
}

class KakaoMessage extends Alarm {
    public KakaoMessage(String name) {
        super(name, 2);
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("카카오톡으로 알림 (to " + getName() + "): " + message);
    }
}

class NotEnoughBookException extends Exception {
    public NotEnoughBookException(String message) {
        super(message);
    }
}

class NumOverException extends Exception {
    public NumOverException(String message) {
        super(message);
    }
}

public class Book {
    private String title;
    private String author;
    private String publisher;
    private double price;
    private int quantity;   // 전체 수량 정보
    private int numRemainingBook;   // 남아 있는 권수 정보
    private ArrayList<Alarm> alarms;  // 도서가 남아 있지 않을 경우 예약 추가

    public Book(String title, String author, String publisher, double price, int quantity) {
        // TODO: 생성자 구현
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.quantity = quantity;
        alarms = new ArrayList<>(); //
    }

    public Book(String title, String author, String publisher, double price, int quantity, int numRemainingBook) {
        // TODO: 생성자 구현
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.quantity = quantity;
        this.numRemainingBook = numRemainingBook;
        alarms = new ArrayList<>(); //
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public boolean IsAvailable() {
        return numRemainingBook > 0;
    }

    public void setNewBorrow() throws NotEnoughBookException {
        // TODO: 현재 보유중인 책 수 numRemainingBook 개수를 감소시키고, 만약 책이 없는데 해당 함수가 호출되면 NotEnoughBookExcpetion 발생
        // Exception 과 관련된 에러메시지는 해당 실행결과 참조
        if (numRemainingBook <= 0){
            throw new NotEnoughBookException("책이 충분하지 않습니다.");
        }else{
            numRemainingBook -= 1;
        }
    }

    public void returnBook() throws NumOverException {
        // TODO: 책을 반남하고, 반납으로 인해 현재 권수가 quantity보다 크면 NumOverException 발생시킴.
        // Exception 과 관련된 에러메시지는 해당 실행결과 참조
        if (numRemainingBook+1 > quantity){
            throw new NumOverException("재고 초과");
        }else{
            numRemainingBook += 1;
        }
    }

    public void addAlarm(int type, String user_name) {
        // TODO: alarms에 새로운 아람을 등록하시오.
        if (type == 1){
            alarms.add(new PhoneCall(user_name));
        } else if (type == 2) {
            alarms.add(new KakaoMessage(user_name));
        }
    }

    public void enableAlarms() {
        for (Alarm alarm : alarms) {
            alarm.sendNotification(title + " is returned");
        }
        alarms.clear();
    }

    public void displayInfo() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("제목: " + title);
        stringBuilder.append(", ");

        // TODO: 각 멤버 변수의 정보를 stringBuilder에 담으시오
        stringBuilder.append("저자: " + author);
        stringBuilder.append(", ");
        stringBuilder.append("출판사: " + publisher);
        stringBuilder.append(", ");
        stringBuilder.append("가격: " + price);
        stringBuilder.append(", ");
        stringBuilder.append("총재고: " + quantity);
        stringBuilder.append(", ");
        stringBuilder.append("남은 재고: " + numRemainingBook);

        for (Alarm each_alarm : alarms) {
            // TODO: 알람 정보를 stringBuilder에 담으시오
            for (Alarm alarm : alarms) {
                stringBuilder.append(", 요청 알람: [" + alarm.toString() + "]");
            };
        }



        System.out.println(stringBuilder.toString());
    }

    @Override
    public String toString() {
        StringBuilder csvBuilder = new StringBuilder();

        String base = String.format("%s,%s,%s,%d,%d", title, author, publisher, quantity, numRemainingBook);
        csvBuilder.append(base);

        for (Alarm alarm : alarms) {
            // TODO: 알람 정보를 csvBuilder에 담으시오, comma ,알람 스트링 순으로 담으시오.
            csvBuilder.append(",").append(alarm.toString());
        }

        return csvBuilder.toString();
    }
}
