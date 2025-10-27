class Pet {
    private String name;
    private String species;
    private int age;

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayPetDetails() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
    }

    public int calculateHumanYears() {
        return age * 7;
    }
}

class Dog extends Pet {
    private String favoriteToy;

    public Dog(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    @Override
    public void displayPetDetails() {
        super.displayPetDetails();
        System.out.println("Favorite Toy: " + favoriteToy);
        System.out.println("Age in Human Years: " + calculateHumanYears() + " years");
    }

    @Override
    public int calculateHumanYears() {
        return getAge() * 7;
    }
}

class Bird extends Pet {
    private double wingspan; 

    public Bird(String name, int age, double wingspan) {
        super(name, "Bird", age);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public void displayPetDetails() {
        super.displayPetDetails();
        System.out.println("Wingspan: " + wingspan + " cm");
        System.out.println("Age in Human Years: " + calculateHumanYears() + " years");
    }

    @Override
    public int calculateHumanYears() {
        return getAge() * 5;
    }
}
