public class CustomerMain {
    public static void main(String[] args) {
        LoyalCustomer customer = new LoyalCustomer("Jane Doe", "Sergio@Gmail.com", 10);

        customer.addPurchase(10);
        customer.addPurchase(50);
        customer.addPurchase(150);

        customer.displayCustomerInfo();

        double total = customer.calculateTotalExpenditure();
        double discountedTotal = customer.applyDiscount(total);

        System.out.println("Total After Discount: ₱" + discountedTotal);
    }

    // Added LoyalCustomer class to fix the missing symbol error
    static class LoyalCustomer {
        private String name;
        private String email;
        private int rewardPoints;
        private java.util.List<Double> purchases;

        public LoyalCustomer(String name, String email, int rewardPoints) {
            this.name = name;
            this.email = email;
            this.rewardPoints = rewardPoints;
            this.purchases = new java.util.ArrayList<>();
        }

        public void addPurchase(double amount) {
            if (amount > 0) {
                purchases.add(amount);
            }
        }

        public void displayCustomerInfo() {
            System.out.println("Customer: " + name);
            System.out.println("Email: " + email);
            System.out.println("Reward Points: " + rewardPoints);
        }

        public double calculateTotalExpenditure() {
            double sum = 0;
            for (double p : purchases) {
                sum += p;
            }
            return sum;
        }

        public double applyDiscount(double total) {
            // Treat rewardPoints as percentage discount, capped at 50%
            double discountRate = Math.min(rewardPoints, 50) / 100.0;
            return total * (1 - discountRate);
        }
    }
}