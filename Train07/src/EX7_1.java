import java.util.HashMap;
import java.util.Map;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, String department, double salary) {
        // todo: constructor 완성
        super(name, department);
        this.salary = salary;
    }


    @Override public double calculateSalary() {
        // todo: uncomment following sentence
        return salary * 12;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    double hoursWorked;

    PartTimeEmployee(String name, String department, double hourlyRate, double hoursWorked) {
        // todo: constructor 완성
        super(name, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override public double calculateSalary() {
        // todo: uncomment following sentence
         return hourlyRate * hoursWorked * 4;
    }
}

public class EX7_1 {
    public static void main(String[] args) {
        Map<String, Employee> employees = new HashMap<>();
        employees.put("John Smith", new FullTimeEmployee("John Smith", "Finance", 5000));
        employees.put("Jane Doe", new PartTimeEmployee("Jane Doe", "IT", 20, 40));
        employees.put("Bob Johnson", new FullTimeEmployee("Bob Johnson", "Marketing", 4000));

        for (Employee employee : employees.values()) {
            System.out.println(employee.name + " in " + employee.department + " department earns " + employee.calculateSalary() + " dollars.");
        }
    }
}
