import java.util.*;

class Student18 implements Comparable<Student18>{
    String name;
    int age;
    Student18(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student18 other){
        if(this.age != other.age){
            return Integer.compare(this.age, other.age);
        }
        else{
            return this.name.compareTo(other.name);
        }
    }
}

public class EX19_1 {
    public static void main(String[] args) {
        TreeSet<Student18> std = new TreeSet<>();
        std.add(new Student18("John", 20));
        std.add(new Student18("Emily", 18));
        std.add(new Student18("David", 22));
        std.add(new Student18("Sarah", 20));
        std.add(new Student18("Michael", 19));

        for (Student18 student : std) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}
