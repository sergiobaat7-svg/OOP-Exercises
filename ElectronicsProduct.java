
    class ElectronicsProduct {
    private String brand;
    private String model;
    private double price;

    public ElectronicsProduct(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayProductDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₱" + price);
    }
}

class WashingMachine extends ElectronicsProduct {
    private double capacity; 
    private boolean hasDryer;

    public WashingMachine(String brand, String model, double price, double capacity, boolean hasDryer) {
        super(brand, model, price);
        this.capacity = capacity;
        this.hasDryer = hasDryer;
    }

   
    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public boolean isHasDryer() {
        return hasDryer;
    }

    public void setHasDryer(boolean hasDryer) {
        this.hasDryer = hasDryer;
    }

    public void displayWashingMachineDetails() {
        super.displayProductDetails();
        System.out.println("Capacity: " + capacity + " kg");
        System.out.println("Has Dryer: " + (hasDryer ? "Yes" : "No"));
    }
}
