import java.util.HashMap;
import java.util.Map;

public class Inventory {
    // Map to store product names and their quantities
    private Map<String, Integer> products;
    // Threshold for low inventory check
    private int lowInventoryThreshold;

    public Inventory(int lowInventoryThreshold) {
        products = new HashMap<>();
        this.lowInventoryThreshold = lowInventoryThreshold;
    }

    // Add a product or increase quantity
    public void addProduct(String product, int quantity) {
        products.put(product, products.getOrDefault(product, 0) + quantity);
        System.out.println(quantity + " units of \"" + product + "\" added to inventory.");
    }

    // Remove product or decrease quantity
    public boolean removeProduct(String product, int quantity) {
        if (!products.containsKey(product)) {
            System.out.println("Product \"" + product + "\" not found in inventory.");
            return false;
        }
        int currentQuantity = products.get(product);
        if (quantity > currentQuantity) {
            System.out.println("Cannot remove more units than available for \"" + product + "\".");
            return false;
        }
        products.put(product, currentQuantity - quantity);
        System.out.println(quantity + " units of \"" + product + "\" removed from inventory.");
        // If quantity becomes 0, remove product from inventory
        if (products.get(product) == 0) {
            products.remove(product);
        }
        return true;
    }

    // Check and display products with low inventory
    public void checkLowInventory() {
        System.out.println("Low Inventory Products (threshold: " + lowInventoryThreshold + "):");
        boolean found = false;
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getValue() <= lowInventoryThreshold) {
                System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " units");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products with low inventory.");
        }
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Inventory inventory = new Inventory(5); // threshold set to 5 units

        inventory.addProduct("Laptop", 10);
        inventory.addProduct("Mouse", 4);
        inventory.addProduct("Keyboard", 7);

        inventory.checkLowInventory();

        inventory.removeProduct("Laptop", 6);
        inventory.removeProduct("Mouse", 2);

        inventory.checkLowInventory();

        inventory.removeProduct("Mouse", 2); // should remove Mouse from inventory
        inventory.checkLowInventory();
    }
}