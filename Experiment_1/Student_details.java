import java.util.Scanner;

public class Student_details{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your address: ");
        String add = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println(name);
        System.out.println(add);
        System.out.println(age);

        // scanner.close();
    }
}