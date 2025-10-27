
class CustomerOrder {
    private String orderId;
    private String customerName;
    private String orderDate;

    public CustomerOrder(String orderId, String customerName, String orderDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Order Date: " + orderDate);
    }
}

class OnlineOrder extends CustomerOrder {
    private String deliveryAddress;
    private String trackingNumber;
    private String status;

    public OnlineOrder(String orderId, String customerName, String orderDate, String deliveryAddress, String trackingNumber) {
        super(orderId, customerName, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
        this.status = "Processing";
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int calculateDeliveryTime(String address) {
        if (address.toLowerCase().contains("manila")) {
            return 2;
        } else if (address.toLowerCase().contains("cebu")) {
            return 4;
        } else {
            return 5;
        }
    }

    public void updateTrackingStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Tracking status updated to: " + newStatus);
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Status: " + status);
        System.out.println("Estimated Delivery Time: " + calculateDeliveryTime(deliveryAddress) + " days");
    }
}
