import java.util.HashMap;
import java.util.Map;

public class ProductInventory {

    public static void main(String[] args) {
        
        Map<Integer, Integer> inventory = new HashMap<>();

       
        inventory.put(1001, 50); // Product ID 1001, Quantity 50
        inventory.put(1002, 120); // Product ID 1002, Quantity 120
        inventory.put(1003, 75);  // Product ID 1003, Quantity 75
        System.out.println("Initial Inventory:");
        printInventory(inventory);

       
        int productIdToUpdate = 1001;
        int newQuantity = 45; 
        if (inventory.containsKey(productIdToUpdate)) {
            inventory.put(productIdToUpdate, newQuantity); 
            System.out.println("\nUpdated quantity for Product ID: " + productIdToUpdate + " to " + newQuantity);
        } else {
            System.out.println("\nProduct ID " + productIdToUpdate + " not found for update.");
        }


        
        int productIdToRemove = 1002;
        if (inventory.containsKey(productIdToRemove)) {
            inventory.remove(productIdToRemove);
            System.out.println("Removed Product ID: " + productIdToRemove);
        } else {
            System.out.println("Product ID " + productIdToRemove + " not found for removal.");
        }


      
        System.out.println("\nFinal Inventory:");
        printInventory(inventory);
    }

    /**
     * Helper method to print the inventory map.
     * @param inventory The inventory map (productId -> quantity) to print.
     */
    public static void printInventory(Map<Integer, Integer> inventory) {
        if (inventory.isEmpty()) {
            System.out.println("  Inventory is empty.");
        } else {
        
            for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
                System.out.println("  Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
            }
        }
        System.out.println("------------------------------");
    }
}