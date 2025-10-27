import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private String email;
    private List<Double> purchaseHistory;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Double> getPurchaseHistory() {
        return purchaseHistory;
    }

    
    public void addPurchase(double amount) {
        purchaseHistory.add(amount);
    }

    public double calculateTotalExpenditure() {
        double total = 0;
        for (double amount : purchaseHistory) {
            total += amount;
        }
        return total;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Total Expenditure: ₱" + calculateTotalExpenditure());
    }
}

class LoyalCustomer extends Customer {
    private double discountRate;

    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }

    // Getter and Setter
    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double applyDiscount(double amount) {
        return amount - (amount * discountRate / 100);
    }

    @Override
    public void displayCustomerInfo() {
        super.displayCustomerInfo();
        System.out.println("Loyalty Discount Rate: " + discountRate + "%");
    }
}