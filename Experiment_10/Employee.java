/**
 * Represents an Employee with id, name, and salary.
 * Used in Lab Experiment 10, Task 2.
 */
public class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter for salary (needed for update)
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString() method for easy printing of Employee objects
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + String.format("%.2f", salary) + // Format salary
                '}';
    }
}