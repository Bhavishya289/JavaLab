import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueNames {

    public static void main(String[] args) {
        
        String[] namesArray = {"Ajay", "Mohit", "Devansh", "Vijay", "Ajay", "Shrey"};
        System.out.println("Original Array of Names: " + Arrays.toString(namesArray));

        Set<String> uniqueNames = new HashSet<>(Arrays.asList(namesArray));

        System.out.println("\nUnique Names (from HashSet):");
        
        System.out.println("  " + uniqueNames);
        System.out.println("------------------------------");


       
        String nameToCheck = "Divyansh";
        boolean exists = uniqueNames.contains(nameToCheck);
        System.out.println("\nChecking if \"" + nameToCheck + "\" exists in the set: " + exists);

        nameToCheck = "Rahul";
        exists = uniqueNames.contains(nameToCheck);
        System.out.println("Checking if \"" + nameToCheck + "\" exists in the set: " + exists);
        System.out.println("------------------------------");
    }
}