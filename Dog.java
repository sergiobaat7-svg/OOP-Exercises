public class Dog {
    // Instance variables
    private String name;
    private String breed;
    
    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    
    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Setter method for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    // Getter method for name
    public String getName() {
        return name;
    }
    
    // Getter method for breed
    public String getBreed() {
        return breed;
    }
    
    public static void main(String[] args) {
        // Create two instances of Dog
        Dog dog1 = new Dog("8k", "German Shepherd");
        Dog dog2 = new Dog("13k", "Golden Retriever");
        
        // Print initial values
        System.out.println("Initial values:");
        System.out.println("Dog 1: " + dog1.getName() + " - " + dog1.getBreed());
        System.out.println("Dog 2: " + dog2.getName() + " - " + dog2.getBreed());
        
        // Modify attributes using setter methods
        dog1.setName("10k");
        dog1.setBreed("German SShepherd");
        dog2.setName("15k");
        dog2.setBreed("Golden Retriever");
        
        // Print updated values
        System.out.println("\nUpdated values:");
        System.out.println("Dog 1: " + dog1.getName() + " - " + dog1.getBreed());
        System.out.println("Dog 2: " + dog2.getName() + " - " + dog2.getBreed());
    }
}