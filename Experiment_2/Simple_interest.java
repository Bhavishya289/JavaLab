import java.util.Scanner;

public class Simple_interest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Principle of interest: ");
        int p = scanner.nextInt();

        System.out.println("Enter the Rate of interest: ");
        double r = scanner.nextDouble();

        System.out.println("Enter the Time of interest in minutes: ");
        int t = scanner.nextInt();

        double si = (p*r*t)/100;
        System.out.println("Simple Interest: "+si);
    }
}
