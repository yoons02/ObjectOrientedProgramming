public class task7_1 {

    public static void main(String[] args) {
        
        Person person1 = new Person("사람1", 22);
        Person person2 = new Person("사람2", 24);
        Student7 student1 = new Student7("학생1", 21);
        Student7 student2 = new Student7("학생2", 20);
        
        person1.introduce();
        person2.introduce();
        student1.introduce();
        student2.introduce();
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void introduce()
    {
        System.out.println("[사람] 이름 : " + name + ", 나이 : " + age);
    }
}

class Student7 extends Person { // Student7 클래스는 Person 클래스에서 상속받았습니다.
    
    public Student7(String name, int age)
    {
        super(name, age); // super 키워드를 이용해 부모 클래스의 함수를 호출, super를 단독으로 쓸 경우 부모 클래스의 생성자를 호출
    }

    public void introduce() // 함수 오버라이딩. Person 클래스의 introduce를 대체합니다.
    {
        System.out.println("[학생] 이름 : " + name + ", 나이 : " + age);
    }
}