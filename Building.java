
class Building {
    private String address;
    private int numberOfFloors;
    private double totalArea;

    public Building(String address, int numberOfFloors, double totalArea) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public void displayDetails() {
        System.out.println("Address: " + address);
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Total Area: " + totalArea + " sq. meters");
    }
}

class ResidentialBuilding extends Building {
    private int numberOfApartments;
    private double rentPerApartment;

    public ResidentialBuilding(String address, int numberOfFloors, double totalArea,
                               int numberOfApartments, double rentPerApartment) {
        super(address, numberOfFloors, totalArea);
        this.numberOfApartments = numberOfApartments;
        this.rentPerApartment = rentPerApartment;
    }

    public int getNumberOfApartments() {
        return numberOfApartments;
    }

    public void setNumberOfApartments(int numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
    }

    public double getRentPerApartment() {
        return rentPerApartment;
    }

    public void setRentPerApartment(double rentPerApartment) {
        this.rentPerApartment = rentPerApartment;
    }

    public double calculateTotalRent() {
        return numberOfApartments * rentPerApartment;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Apartments: " + numberOfApartments);
        System.out.println("Rent per Apartment: ₱" + rentPerApartment);
        System.out.println("Total Rent: ₱" + calculateTotalRent());
    }
}

class CommercialBuilding extends Building {
    private int numberOfOffices;
    private double rentPerOffice;

    public CommercialBuilding(String address, int numberOfFloors, double totalArea,
                              int numberOfOffices, double rentPerOffice) {
        super(address, numberOfFloors, totalArea);
        this.numberOfOffices = numberOfOffices;
        this.rentPerOffice = rentPerOffice;
    }

    public int getNumberOfOffices() {
        return numberOfOffices;
    }

    public void setNumberOfOffices(int numberOfOffices) {
        this.numberOfOffices = numberOfOffices;
    }

    public double getRentPerOffice() {
        return rentPerOffice;
    }

    public void setRentPerOffice(double rentPerOffice) {
        this.rentPerOffice = rentPerOffice;
    }

    public double calculateTotalRent() {
        return numberOfOffices * rentPerOffice;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Offices: " + numberOfOffices);
        System.out.println("Rent per Office: ₱" + rentPerOffice);
        System.out.println("Total Rent: ₱" + calculateTotalRent());
    }
}
