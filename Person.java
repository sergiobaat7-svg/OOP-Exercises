
public class Person {
    private String name;
    private int age;

    // Constructor to set name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create two instances of Person
        Person person1 = new Person("sarge", 21);
        Person person2 = new Person("Baat", 22);

        // Print their name and age
        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}