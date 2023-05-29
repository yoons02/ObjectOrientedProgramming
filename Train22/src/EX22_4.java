interface Worker22 {
    void work();

    void eat();

    void order();
}

class Programmer implements Worker22 {
    @Override
    public void work() { System.out.println("프로그래머가 일을 합니다."); }
    @Override
    public void eat() { System.out.println("프로그래머가 식사를 합니다."); }
    @Override
    public void order() { System.out.println("프로그래머가 잠을 잡니다."); }
}

class Manager implements Worker22 {
    @Override
    public void work() { System.out.println("매니저가 업무를 처리합니다."); }
    @Override
    public void eat() { System.out.println("매니저가 식사를 합니다."); }
    @Override public void order() { System.out.println("매니저가 명령을 합니다."); }
}

public class EX22_4 {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Manager manager = new Manager();

        programmer.work();

        manager.work();
        manager.eat();
        manager.order();
    }
}
