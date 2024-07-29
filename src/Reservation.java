import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Reservation {
    private String reservationID;
    private Flight flight;
    private Seat seat;
    private Passenger passenger;
    private LocalDate reservationDate;

    public Reservation(String reservationID, Flight flight, Seat seat, Passenger passenger, LocalDate reservationDate) {
        this.reservationID = reservationID;
        this.flight = flight;
        this.seat = seat;
        this.passenger = passenger;
        this.reservationDate = reservationDate;
    }

    // Getter methods
    public String getReservationID() {
        return reservationID;
    }

    public Flight getFlight() {
        return flight;
    }

    public Seat getSeat() {
        return seat;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public String formatReservationDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss z yyyy").withZone(ZoneId.of("Asia/Kuala_Lumpur"));
        String formattedDate = formatter.format(new Date().toInstant());

        return "Reservation Details:\n" +
                "--------------------\n" +
                "Reservation ID: " + reservationID + "\n" +
                "Passenger: " + passenger.getName() + "\n" +
                "Email: " + passenger.getEmail() + "\n" +
                "Phone: " + passenger.getPhoneNumber() + "\n" +
                "Flight: " + flight.getFlightNumber() + "\n" +
                "Departure: " + flight.getDepartureAirport() + "\n" +
                "Arrival: " + flight.getArrivalAirport() + "\n" +
                "Seat: " + seat.getSeatNumber() + " (" + seat.getSeatClass() + ")\n" +
                "Reservation Date: " + formattedDate;
    }
}
