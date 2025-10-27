package Event;


public class EventManagement {
    public static void main(String[] args) {
        // Create Seminar object
        Seminar seminar = new Seminar(
                "AI Innovation Summit",
                LocalDateTime.of(2025, 11, 15, 10, 0),
                "Conference Hall A",
                5
        );

        // Create MusicalPerformance object
        List<String> performers = new ArrayList<>();
        performers.add("The Rolling Beats");
        performers.add("DJ Sonic");

        MusicalPerformance concert = new MusicalPerformance(
                "Autumn Music Fest",
                LocalDateTime.of(2025, 11, 15, 10, 0),
                "Conference Hall A",
                performers
        );

        // Display event details
        System.out.println("=== Event Details ===");
        seminar.displayDetails();
        concert.displayDetails();

        // Check for conflicts
        System.out.println("=== Checking for Conflicts ===");
        if (seminar.conflictsWith(concert)) {
            System.out.println("⚠️ Conflict detected: Both events are scheduled at the same time and location!");
        } else {
            System.out.println("✅ No conflicts detected between events.");
        }
    }
}