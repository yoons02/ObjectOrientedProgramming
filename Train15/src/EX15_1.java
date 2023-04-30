import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

class Person15 {
    private String name;
    private int age;

    public Person15(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class EX15_1 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // ArrayList 생성
        ArrayList<Person15> people = new ArrayList<>();

        // Person 객체 생성하여 ArrayList에 추가
        System.out.printf("Enter the number of people you want to add : ");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Enter name and age for person " + i);
            String name = scanner.next();
            int age = scanner.nextInt();
            people.add(new Person15(name, age));
        }

        // ArrayList 출력
        System.out.println("Person List: " + people);

        // index 1에 위치한 Person 객체 삭제
        System.out.printf("Enter the index of the person you want to remove :");
        int index = scanner.nextInt();
        people.remove(index);

        // ArrayList 출력
        System.out.println("Person removed from index " + index);
        System.out.println("Updated person list : " + people);

        // index 0에 위치한 Person 객체 이름 변경
        System.out.printf("Enter the index of the person you want to modify : ");
        index = scanner.nextInt();
        String name = scanner.next();
        people.get(index).setName(name);

        // ArrayList 출력
        System.out.println("Person at index "+ index +" updated.");
        System.out.println("ArrayList: " + people);

        // 이름이 "David"인 Person 객체 검색
        System.out.println("Enter the name of the person you want to search :");
        String searchName = scanner.next();
        for (Person15 person : people) {
            if (person.getName().equals(searchName)) {
                System.out.println(" Person found : " + person);
                break;
            }
        }

        // 나이 순으로 정렬
        people.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

        // ArrayList 출력
        System.out.println("Sorted Person List by Age : " + people);

        // 이름 순으로 정렬
        people.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        // ArrayList 출력
        System.out.println("Sorted Person List by Name : " + people);

        // Scanner 종료
        scanner.close();
    }
}
