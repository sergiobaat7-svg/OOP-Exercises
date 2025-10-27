public class ReservationMain {
    public static void main(String[] args) {
        ResortReservation resort = new ResortReservation("RSV001", "Sergio ", "2025-12-10", "A-102", true);
        RailwayReservation railway = new RailwayReservation("RSV002", "Baat","2025-12-11", "12B", "TR-5678");

        System.out.println(" Resort Reservation Details:");
        resort.displayDetails();
        resort.checkReservationStatus();

        System.out.println("\n Railway Reservation Details:");
        railway.displayDetails();
        railway.checkReservationStatus();

        System.out.println("\n Updating reservation dates...");
        resort.modifyReservation("2025-12-12");
        railway.modifyReservation("2025-12-13");
    }
}