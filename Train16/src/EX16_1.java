import java.util.ArrayList;

// 단반향 관계 : 1대n, 단방향관계이기 때문에 Student 객체를 참조하는 속성은 정의되지 않음
class Course {

    private String courseName;  // 수업 이름

    // 생성자
    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return this.courseName;
    }
}


// 단반향 관계 : 1대N
class Student16 {

    private String name;            // 학생이름
    private ArrayList<Course> courses; // 수강과목들 : 컬렉션 자료구조를 통해 여러개의 Course 클래스 객체를 참조할 수 있음

    //  생성자
    public Student16(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }


    //  수강 등록
    public void registerCourse(Course course) {
        courses.add(course);
    }

    //  수강 취소
    public void dropCourse(Course course) {
        courses.remove(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}

public class EX16_1 {
    public static void main(String[] args) {
        // 학생 객체 생성
        Student16 student = new Student16("홍깊동");

        // 수업 객체 생성
        Course os = new Course("운영체제");
        Course ds = new Course("자료구조");
        Course nt = new Course("네트워크");

        // 학생 객체에서 수업 등록
        student.registerCourse(os);
        student.registerCourse(ds);
        student.registerCourse(nt);

        System.out.println(student);

        // 학생 객체에서 수업 등록 취소
        student.dropCourse(os);

        System.out.println(student);
    }

}
