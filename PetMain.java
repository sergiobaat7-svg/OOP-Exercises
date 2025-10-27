
public class PetMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Bato", 4, "Baseball ball");
        Bird bird = new Bird("cardo", 2, 35.5);

        System.out.println(" Dog Details:");
        dog.displayPetDetails();

        System.out.println("\n Bird Details:");
        bird.displayPetDetails();
    }
}