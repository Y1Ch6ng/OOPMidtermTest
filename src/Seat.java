public class Seat {
    private String seatNumber;
    private String seatClass;
    private boolean availability;
    private Flight flight;

    public Seat(String seatNumber, String seatClass, boolean availability, Flight flight) {
        this.seatNumber = seatNumber;
        this.seatClass = seatClass;
        this.availability = availability;
        this.flight = flight;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public boolean isAvailable() {
        return availability;
    }

    // Getter methods
    public String getSeatNumber() {
        return seatNumber;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public Flight getFlight() {
        return flight;
    }
}
