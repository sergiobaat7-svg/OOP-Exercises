import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Base class: Event
class Event {
    protected String eventName;
    protected LocalDateTime dateTime;
    protected String location;

    public Event(String eventName, LocalDateTime dateTime, String location) {
        this.eventName = eventName;
        this.dateTime = dateTime;
        this.location = location;
    }

    // Method to display event details
    public void displayDetails() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Date & Time: " + dateTime);
        System.out.println("Location: " + location);
    }

    // Check for schedule conflicts (same time and location)
    public boolean conflictsWith(Event otherEvent) {
        return this.location.equalsIgnoreCase(otherEvent.location)
                && this.dateTime.equals(otherEvent.dateTime);
    }
}

// Subclass: Seminar
class Seminar extends Event {
    private int numberOfSpeakers;

    public Seminar(String eventName, LocalDateTime dateTime, String location, int numberOfSpeakers) {
        super(eventName, dateTime, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Speakers: " + numberOfSpeakers);
        System.out.println("-----------------------------");
    }
}

// Subclass: MusicalPerformance
class MusicalPerformance extends Event {
    private List<String> performers;

    public MusicalPerformance(String eventName, LocalDateTime dateTime, String location, List<String> performers) {
        super(eventName, dateTime, location);
        this.performers = performers;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Performers: " + String.join(", ", performers));
        System.out.println("-----------------------------");
    }
}

// Main class
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