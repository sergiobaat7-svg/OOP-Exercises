package Vehicle;

    public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Vios", 2020, 450);
        Truck truck = new Truck("Isuzu", "D-Max", 2019, 3.5);
        car.displayDetails();
        truck.displayDetails();
    }
}