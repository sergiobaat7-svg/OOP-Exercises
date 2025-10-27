
    public class GymMemberShipMain {
    public static void main(String[] args) {
        GymMembership basic = new GymMembership("Sergio", "Basic", 6, 1500.0);
        PremiumMembership premium = new PremiumMembership("Baat", 12, 2000.0, true, true);

        System.out.println(" Basic Membership Details:");
        basic.displayMembershipDetails();

        System.out.println("\n Premium Membership Details:");
        premium.displayMembershipDetails();
    }
}