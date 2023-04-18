public class task7_2 {

    public static void main(String[] args) {
        
        Company company = new Company("자바게임즈");
        Department department1 = new Department("자바게임즈", "롤 플레잉 게임");
        Department department2 = new Department("자바게임즈", "캐주얼 게임");
        Employee7 employee1 = new Employee7("자바게임즈", "롤 플레잉 게임", "졸린 회사원");
        Employee7 employee2 = new Employee7("자바게임즈", "롤 플레잉 게임", "건강한 회사원");
        Employee7 employee3 = new Employee7("자바게임즈", "캐주얼 게임", "활기찬 회사원");
        Employee7 employee4 = new Employee7("자바게임즈", "캐주얼 게임", "평범한 회사원");

        company.introduce();
        department1.introduce();
        employee1.introduce();
        employee2.introduce();
        department2.introduce();
        employee3.introduce();
        employee4.introduce();
    }
}

class Company {
    String companyName;

    public Company(String name)
    {
        this.companyName = name;
    }

    public void introduce()
    {
        System.out.println("[회사] " + companyName + " 회사입니다.");
    }
}

class Department extends Company { // Company 클래스를 상속받은 Department 클래스
    String departName;

    public Department(String companyName, String departName)
    {
        super(companyName); // 부모 클래스의 생성자를 호출
        this.departName = departName;
    }

    public void introduce() // 함수 오버라이딩, Company 클래스보다 Department 클래스의 함수가 우선됩니다.
    {
        System.out.println("[부서] " + companyName + " 회사의 " + departName + " 부서입니다.");
    }
}

class Employee7 extends Department { // Company 클래스를 상속받은 Department 클래스를 상속받은 Employee7 클래스
    String name;

    public Employee7(String companyName, String departName, String name)
    {
        super(companyName, departName); // 부모 클래스의 생성자를 호출
        this.name = name;
    }

    public void introduce() // 함수 오버라이딩, Department 클래스보다 Employee7 클래스의 함수가 우선됩니다.
    {
        System.out.println("[직원] " + companyName + " 회사의 " + departName + " 부서의 " + name  + "입니다.");
    }
}