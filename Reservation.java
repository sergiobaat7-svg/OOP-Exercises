class Reservation {
    private String reservationId;
    private String customerName;
    private String date;

    public Reservation(String reservationId, String customerName, String date) {
        this.reservationId = reservationId;
        this.customerName = customerName;
        this.date = date;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void displayDetails() {
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Date: " + date);
    }

    public void modifyReservation(String newDate) {
        setDate(newDate);
        System.out.println("Reservation date updated to: " + newDate);
    }
}

class ResortReservation extends Reservation {
    private String roomNumber;
    private boolean breakfastIncluded;

    public ResortReservation(String reservationId, String customerName, String date, String roomNumber, boolean breakfastIncluded) {
        super(reservationId, customerName, date);
        this.roomNumber = roomNumber;
        this.breakfastIncluded = breakfastIncluded;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isBreakfastIncluded() {
        return breakfastIncluded;
    }

    public void setBreakfastIncluded(boolean breakfastIncluded) {
        this.breakfastIncluded = breakfastIncluded;
    }

    public void checkReservationStatus() {
        System.out.println("Room " + roomNumber + " reserved for " + getCustomerName() + ".");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Breakfast Included: " + (breakfastIncluded ? "Yes" : "No"));
    }
}

class RailwayReservation extends Reservation {
    private String seatNumber;
    private String trainNumber;

    public RailwayReservation(String reservationId, String customerName, String date, String seatNumber, String trainNumber) {
        super(reservationId, customerName, date);
        this.seatNumber = seatNumber;
        this.trainNumber = trainNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void checkReservationStatus() {
        System.out.println("Seat " + seatNumber + " on Train " + trainNumber + " reserved for " + getCustomerName() + ".");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Train Number: " + trainNumber);
    }
}