import java.util.Scanner;

public class AreaOfTriangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Base of triangle: ");
        int base = scanner.nextInt();

        System.out.println("Enter the Height of triangle: ");
        int height = scanner.nextInt();

        int mul = (base*height)/2;
        System.out.println("Area of triangle: "+mul);
    }
}
