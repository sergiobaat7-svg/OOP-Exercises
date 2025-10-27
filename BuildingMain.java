public class BuildingMain {
    public static void main(String[] args) {
        ResidentialBuilding rb = new ResidentialBuilding("Balay ni Sarge", 2, 500.0, 10, 1200.0);
        CommercialBuilding cb = new CommercialBuilding("Building ni Moks", 3, 700.0, 12, 2000.0);

        System.out.println(" Residential Building Details:");
        rb.displayDetails();

        System.out.println("Commercial Building Details:");
        cb.displayDetails();
    }
}
