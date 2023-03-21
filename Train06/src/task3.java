public class task3 {

    public static void main(String[] args) {
            
        Student[] studentArr = new Student[5];
        int[] numberArr = {2020123456, 2021110000, 2022987654, 2023456789, 2024273645};
        String[] nameArr = {"학생1", "학생2", "학생3", "학생4", "학생5"};
        
        
        studentArr[0] = new Student();
        studentArr[1] = new Student(numberArr[1]);
        studentArr[2] = new Student(nameArr[2]);
        studentArr[3] = new Student(numberArr[3], nameArr[3]);
        studentArr[4] = new Student(numberArr[4], nameArr[4]);
        
        
        for(int i = 0; i < 5; i++)
        {
            Student s = studentArr[i];
            System.out.printf("학번 : " + s.getNumber() + ", 이름 : " + s.getName() + "\n");
        }
    }
}

class Student {
    
    int number;
    String name;
    
    public Student()
    {
        // number에는 0을 할당해주세요.
        // name에는 "Unknown"을 할당해주세요.
    }
    
    public Student(int number)
    {
        // number에는 매개변수를 할당해주세요.
        // name에는 "Unknown"을 할당해주세요.
    }
    
    public Student(String name)
    {
        // number에는 0을 할당해주세요.
        // name에는 매개변수를 할당해주세요.
    }
    
    public Student(int number, String name)
    {
        // 평범하게 매개변수를 할당해주세요.
    }
    
    public int getNumber()
    {
        return number;
    }
    
    public String getName()
    {
        return name;
    }
}