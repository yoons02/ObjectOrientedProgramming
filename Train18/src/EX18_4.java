//import java.util.TreeSet;
//class Student implements Comparable<Student> {
//    private String name;
//    private int age;
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    // 학생들을 나이 순으로 정렬하기 위한 compareTo 메서드 구현
//    public int compareTo(Student other) {
//        //만약 나이가 동일한 경우 이름의 사전식 순서로 정렬
//
//        //그렇지 않을 경우, 나이 순으로 학생들을 정렬
//
//    }
//}
//public class EX18_4 {
//    public static void main(String[] args) {
//        TreeSet<Student> studentSet = new TreeSet<>();
//
//        // 학생들 생성
//        Student student1 = new Student("John", 20);
//        Student student2 = new Student("Emily", 18);
//        Student student3 = new Student("David", 22);
//        Student student4 = new Student("Sarah", 20);
//        Student student5 = new Student("Michael", 19);
//
//        // TreeSet에 학생들 추가
//        studentSet.add(student1);
//        studentSet.add(student2);
//        studentSet.add(student3);
//        studentSet.add(student4);
//        studentSet.add(student5);
//
//        // 정렬된 학생들 출력
//        System.out.println("정렬된 학생들:");
//        for (Student student : studentSet) {
//            System.out.println("이름: " + student.getName() + ", 나이: " + student.getAge());
//        }
//    }
//}
