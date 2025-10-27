
package Vehicle;

class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) { this.make = make; this.model = model; this.year = year; }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public void displayDetails() { System.out.println(year + " " + make + " " + model); }
}

class Car extends Vehicle {
    private int trunkSize;
    public Car(String make, String model, int year, int trunkSize) { super(make, model, year); this.trunkSize = trunkSize; }

    public int getTrunkSize() { return trunkSize; }
    public void setTrunkSize(int trunkSize) { this.trunkSize = trunkSize; }

    @Override
    public void displayDetails() { super.displayDetails(); System.out.println("Trunk Size: " + trunkSize + " liters"); }
}

class Truck extends Vehicle {
    private double payloadCapacity;
    public Truck(String make, String model, int year, double payloadCapacity) { super(make, model, year); this.payloadCapacity = payloadCapacity; }

    public double getPayloadCapacity() { return payloadCapacity; }
    public void setPayloadCapacity(double payloadCapacity) { this.payloadCapacity = payloadCapacity; }

    @Override
    public void displayDetails() { super.displayDetails(); System.out.println("Payload Capacity: " + payloadCapacity + " tons"); }
}