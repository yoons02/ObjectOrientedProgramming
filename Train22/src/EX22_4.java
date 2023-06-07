interface Workable{
    void work();
}

interface Eatable{
    void eat();
}

interface Orderable{
    void order();
}

class Programmer implements Workable{
    public void work(){
        System.out.println("프로그래머가 업무를 처리합니다.");
    }
}

class Chef implements Workable, Eatable, Orderable{
    public void work(){
        System.out.println("셰프가 업무를 처리합니다.");
    }

    public void eat(){
        System.out.println("셰프가 식사를 합니다.");
    }

    public void order(){
        System.out.println("셰프가 명령을 합니다.");
    }
}

class Manager implements Workable, Orderable{
    public void work(){
        System.out.println("매니저가 업무를 처리합니다.");
    }

    public void order(){
        System.out.println("매니저가 명령을 합니다.");
    }
}

public class EX22_4 {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Chef chef = new Chef();
        Manager manager = new Manager();

        programmer.work();
        chef.work();
        chef.eat();
        manager.work();
    }
}
