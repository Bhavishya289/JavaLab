import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SumUniqueValues {

    public static void main(String[] args) {
       
        List<Integer> numbersWithDuplicates = new ArrayList<>(Arrays.asList(3, 5, 3, 8, 2, 5, 8, 10));
        System.out.println("Original List with Duplicates: " + numbersWithDuplicates);

       
        Set<Integer> uniqueNumbers = new HashSet<>(numbersWithDuplicates);
        System.out.println("Unique Values (from HashSet): " + uniqueNumbers);

    
        int sum = 0;
        
        for (Integer uniqueValue : uniqueNumbers) {
            sum += uniqueValue;
        }

        
        System.out.println("Sum of Unique Values: " + sum);
        System.out.println("------------------------------");

    }
}