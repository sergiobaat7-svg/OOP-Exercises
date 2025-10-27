

public class CustomerOrderMain {
    public static void main(String[] args) {
        OnlineOrder order1 = new OnlineOrder(
            "ORD001",
            "Sergio",
            "2025-10-24",
            "Tagum City, Philippines",
            "TRK12345PH"
        );

        System.out.println(" Online Order Details:");
        order1.displayOrderDetails();

        System.out.println("\n Updating Status...");
        order1.updateTrackingStatus("Out for Delivery");

        System.out.println("\n Updated Order Details:");
        order1.displayOrderDetails();
    }
}