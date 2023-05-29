class Person18{
    private Role role;
    public void doIt() {
        // 역할을 수행하는 기본 동작
        System.out.println("Person is doing something.");
        role.doIt();
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

class Role{

    public void doIt() {
        // 역할을 수행하는 기본 동작
        System.out.println("Role is doing something.");
    }
}

class Driver extends Role {

    @Override
    public void doIt() {
        System.out.println("Driving");  // 오버라이딩
    }
}

class SoccerPlayer extends Role {

    @Override
    public void doIt() {
        System.out.println("Playing Soccer");
    }
}

class Worker extends Person18 {

    @Override
    public void doIt() {
        System.out.println("Working");  // 오버라이딩
    }
}

public class EX18_2 {
    public static void main(String[] args) {

        Person18 person = new Person18();  // 사람 객체 생성

        Role role = new Role();
        person.setRole(role);

        // 운전자
        Driver driver = new Driver();
        driver.doIt();

        // 종업원
        Worker worker = new Worker();
        worker.doIt();

        // 축구선수
        SoccerPlayer player = new SoccerPlayer();
        player.doIt();
    }
}
