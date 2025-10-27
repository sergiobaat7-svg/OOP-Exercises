import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {
    private Map<String, Double> menuItems; // Item name -> Price
    private Map<String, List<Integer>> itemRatings; // Item name -> List of ratings

    public Restaurant() {
        menuItems = new HashMap<>();
        itemRatings = new HashMap<>();
    }

    // Add a menu item with price
    public void addMenuItem(String item, double price) {
        menuItems.put(item, price);
        itemRatings.putIfAbsent(item, new ArrayList<>());
        System.out.println("Menu item \"" + item + "\" added with price $" + price);
    }

    // Remove a menu item
    public boolean removeMenuItem(String item) {
        if (menuItems.remove(item) != null) {
            itemRatings.remove(item);
            System.out.println("Menu item \"" + item + "\" removed.");
            return true;
        } else {
            System.out.println("Menu item \"" + item + "\" not found.");
            return false;
        }
    }

    // Add a rating for a menu item
    public boolean addRating(String item, int rating) {
        if (!itemRatings.containsKey(item)) {
            System.out.println("Menu item \"" + item + "\" not found for rating.");
            return false;
        }
        if (rating < 1 || rating > 5) {
            System.out.println("Rating should be between 1 and 5.");
            return false;
        }
        itemRatings.get(item).add(rating);
        System.out.println("Rating " + rating + " added for \"" + item + "\"");
        return true;
    }

    // Calculate average rating for a menu item
    public double getAverageRating(String item) {
        List<Integer> ratings = itemRatings.get(item);
        if (ratings == null || ratings.isEmpty()) {
            System.out.println("No ratings available for \"" + item + "\"");
            return 0.0;
        }
        double sum = 0.0;
        for (int r : ratings) {
            sum += r;
        }
        return sum / ratings.size();
    }

    // Show menu
    public void showMenu() {
        System.out.println("Menu:");
        for (String item : menuItems.keySet()) {
            System.out.printf("- %s: $%.2f\n", item, menuItems.get(item));
        }
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.addMenuItem("Burger", 3.99);
        restaurant.addMenuItem("Pizza", 5.49);
        restaurant.addMenuItem("Salad", 6.75);

        restaurant.showMenu();

        restaurant.addRating("Burger", 5);
        restaurant.addRating("Burger", 4);
        restaurant.addRating("Pizza", 3);

        System.out.printf("Average rating for Burger: %.2f\n", restaurant.getAverageRating("Burger"));
        System.out.printf("Average rating for Pizza: %.2f\n", restaurant.getAverageRating("Pizza"));
        System.out.printf("Average rating for Salad: %.2f\n", restaurant.getAverageRating("Salad"));

        restaurant.removeMenuItem("Salad");
        restaurant.showMenu();
    }
}