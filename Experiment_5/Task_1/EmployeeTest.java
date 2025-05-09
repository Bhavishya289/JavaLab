class Employee {
    private String name;
    private int empid;
    protected double salary;

    // Default constructor
    public Employee() {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }

    // Parameterized constructor
    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Method to increase salary
    public void increaseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }

    // Display method
    public void displayInfo() {
        System.out.println("Employee ID: " + empid + ", Name: " + name + ", Salary: $" + salary);
    }
}

// Subclass Manager
class Manager extends Employee {
    private String department;

    // Constructor chaining
    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    // Overriding display method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

// Test Program
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101, 50000);
        Manager mgr = new Manager("Bob", 102, 70000, "IT");

        emp.displayInfo();
        mgr.displayInfo();

        // Increase salary
        emp.increaseSalary(10);
        mgr.increaseSalary(15);

        System.out.println("\nAfter Salary Increase:");
        emp.displayInfo();
        mgr.displayInfo();
    }
}

