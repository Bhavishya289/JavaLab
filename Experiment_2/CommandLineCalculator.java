public class CommandLineCalculator {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two integers as command-line arguments.");
            System.out.println("Usage: java CommandLineCalculator <num1> <num2>");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            System.out.println("Number 1: " + num1);
            System.out.println("Number 2: " + num2);
            System.out.println("Addition of the numbers: " + (num1 + num2));
            System.out.println("Subtraction of the numbers: " + (num1 - num2));
            System.out.println("Multiplication of the numbers: " + (num1 * num2));

            if (num2 != 0) {
                System.out.println("Division of the numbers: " + (num1 / (double) num2));
            } else {
                System.out.println("Division: Error! Division by zero is not allowed.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Both arguments must be valid integers.");
        }
    }
}
