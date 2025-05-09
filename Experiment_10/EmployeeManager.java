import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(101, "Alice", 60000.00));
        employeeList.add(new Employee(102, "Bob", 75000.50));
        employeeList.add(new Employee(103, "Charlie", 55000.75));

        System.out.println("Initial Employee List:");
        printEmployeeList(employeeList);

        int employeeIdToUpdate = 102;
        double newSalary = 80000.00;
        boolean updated = false;
        for (Employee emp : employeeList) {
            if (emp.getId() == employeeIdToUpdate) {
                emp.setSalary(newSalary);
                System.out.println("\nUpdated salary for Employee ID: " + employeeIdToUpdate);
                updated = true;
                break; // Exit loop once updated
            }
        }
        if (!updated) {
            System.out.println("\nEmployee ID " + employeeIdToUpdate + " not found for update.");
        }

        int employeeIdToRemove = 103;
        boolean removed = false;

        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getId() == employeeIdToRemove) {
                iterator.remove(); 
                System.out.println("Removed Employee ID: " + employeeIdToRemove);
                removed = true;
                break; // Exit loop once removed
            }
        }
        if (!removed) {
            System.out.println("Employee ID " + employeeIdToRemove + " not found for removal.");
        }


        System.out.println("\nFinal Employee List:");
        printEmployeeList(employeeList);
    }

    /**
     * Helper method to print the list of employees.
     * @param list The list of employees to print.
     */
    public static void printEmployeeList(List<Employee> list) {
        if (list.isEmpty()) {
            System.out.println("  List is empty.");
        } else {
            for (Employee emp : list) {
                System.out.println("  " + emp);
            }
        }
        System.out.println("------------------------------");
    }
}