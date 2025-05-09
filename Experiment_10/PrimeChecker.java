import java.util.ArrayList;
import java.util.List;

public class PrimeChecker {

    /**
     * Checks if a given number is prime.
     * @param number The integer to check.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int number) {
        // Numbers less than 2 are not prime
        if (number < 2) {
            return false;
        }
       
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
    
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(23);
        numbers.add(25);
        numbers.add(1);
        numbers.add(0);

        System.out.println("Checking numbers in the list for primality:");
        System.out.println("-----------------------------------------");

       
        for (Integer numObject : numbers) {
            
            int numValue = numObject; 
            boolean prime = isPrime(numValue); 

            
            System.out.println(numValue + (prime ? " is prime." : " is not prime."));
        }
        System.out.println("-----------------------------------------");
    }
}