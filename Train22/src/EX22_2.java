import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person22 {
    private String name;
    private String age;
    private String city;

    public Person22(String name, String age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}

public class EX22_2 {
    private static final String CSV_FILE = "data.csv";
    private static final String CSV_SPLIT_BY = ",";

    public static void main(String[] args) {
        List<Person22> personList = readDataFromCSV();

        // Print the personList
        // TODO: 구현
        try(BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        // Add a new student
        addNewStudentToCSV();

        // Read the updated data from CSV
        personList = readDataFromCSV();

        // Print the personList
        // TODO: 구현
        try(BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static List<Person22> readDataFromCSV() {
        List<Person22> personList = new ArrayList<>();

        // TODO: 구현
        try(BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))){
            String line;
            while ((line = reader.readLine()) != null){
                String[] data = line.split(CSV_SPLIT_BY);
                Person22 p = new Person22(data[0], data[1], data[2]);
                personList.add(p);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        return personList;
    }

    private static void addNewStudentToCSV() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CSV_FILE, true))) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the name of the student: ");
            String name = scanner.nextLine();

            System.out.print("Enter the age of the student: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            System.out.print("Enter the city of the student: ");
            String city = scanner.nextLine();

            // TODO: 구현
            bw.newLine();
            bw.write(name);
            bw.write(",");
            bw.write(String.valueOf(age));
            bw.write(",");
            bw.write(city);

            System.out.println("New student added to the CSV file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
