import java.util.ArrayList;
import java.util.List;

class Flight {
    String flightNumber;
    String destination;
    boolean booked;

    public Flight(String flightNumber, String destination) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.booked = false;
    }
}

class Hotel {
    String name;
    String location;
    boolean booked;

    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
        this.booked = false;
    }
}

public class TravelService {
    private List<Flight> flights;
    private List<Hotel> hotels;

    public TravelService() {
        flights = new ArrayList<>();
        hotels = new ArrayList<>();
        // Example data
        flights.add(new Flight("NB123", "Tagum"));
        flights.add(new Flight("NB123", "Davao"));
        hotels.add(new Hotel("Stay in", "Tagum"));
        hotels.add(new Hotel("In and Out", "Davao"));
    }

    // Search for flights by destination
    public List<Flight> searchFlights(String destination) {
        List<Flight> result = new ArrayList<>();
        for (Flight f : flights) {
            if (f.destination.equalsIgnoreCase(destination)) {
                result.add(f);
            }
        }
        return result;
    }

    // Search for hotels by location
    public List<Hotel> searchHotels(String location) {
        List<Hotel> result = new ArrayList<>();
        for (Hotel h : hotels) {
            if (h.location.equalsIgnoreCase(location)) {
                result.add(h);
            }
        }
        return result;
    }

    // Book a flight by flight number
    public boolean bookFlight(String flightNumber) {
        for (Flight f : flights) {
            if (f.flightNumber.equalsIgnoreCase(flightNumber) && !f.booked) {
                f.booked = true;
                System.out.println("Flight " + flightNumber + " booked.");
                return true;
            }
        }
        System.out.println("Flight " + flightNumber + " not available for booking.");
        return false;
    }

    // Cancel a flight reservation
    public boolean cancelFlight(String flightNumber) {
        for (Flight f : flights) {
            if (f.flightNumber.equalsIgnoreCase(flightNumber) && f.booked) {
                f.booked = false;
                System.out.println("Flight " + flightNumber + " reservation canceled.");
                return true;
            }
        }
        System.out.println("No booking found for flight " + flightNumber + ".");
        return false;
    }

    // Book a hotel by name
    public boolean bookHotel(String hotelName) {
        for (Hotel h : hotels) {
            if (h.name.equalsIgnoreCase(hotelName) && !h.booked) {
                h.booked = true;
                System.out.println("Hotel " + hotelName + " booked.");
                return true;
            }
        }
        System.out.println("Hotel " + hotelName + " not available for booking.");
        return false;
    }

    // Cancel a hotel reservation
    public boolean cancelHotel(String hotelName) {
        for (Hotel h : hotels) {
            if (h.name.equalsIgnoreCase(hotelName) && h.booked) {
                h.booked = false;
                System.out.println("Hotel " + hotelName + " reservation canceled.");
                return true;
            }
        }
        System.out.println("No booking found for hotel " + hotelName + ".");
        return false;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        TravelService service = new TravelService();

        System.out.println("Flights to Tagum:");
        for (Flight f : service.searchFlights("Tagum")) {
            System.out.println("- " + f.flightNumber);
        }

        System.out.println("Hotels in Tagum:");
        for (Hotel h : service.searchHotels("Tagum")) {
            System.out.println("- " + h.name);
        }

        service.bookFlight("NB123");
        service.cancelFlight("NB123");
        service.bookHotel("Stay in");
        service.cancelHotel("In an Out");
    }
}