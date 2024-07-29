import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Create a Flight
        Flight flight = new Flight("FL123", "JFK", "LAX", LocalDate.of(2024, 7, 29), LocalTime.of(15, 43));

        // Create some Seats for the Flight
        Seat seat1 = new Seat("1A", "Economy", true, flight);
        Seat seat2 = new Seat("1B", "Economy", true, flight);
        Seat seat3 = new Seat("1C", "Business", true, flight);

        // Add seats to the flight
        flight.addSeat(seat1);
        flight.addSeat(seat2);
        flight.addSeat(seat3);

        // Create a Passenger
        Passenger passenger = new Passenger("P001", "Wong Wilson", "A12345678", "wilsonw5915@gmail.com", "011-55074862");

        // Find available seats before reservation
        System.out.println("Available seats before reservation:");
        for (Seat seat : flight.findAvailableSeats()) {
            System.out.println(seat.getSeatNumber() + " (" + seat.getSeatClass() + ")");
        }

        // Create a Reservation
        Reservation reservation = passenger.createReservation(flight, seat1);
        if (reservation != null) {
            System.out.println("Reservation created successfully!");
            System.out.println(reservation.formatReservationDetails());
        } else {
            System.out.println("Failed to create reservation.");
        }

        // Find available seats after reservation
        System.out.println("Available seats after reservation:");
        for (Seat seat : flight.findAvailableSeats()) {
            System.out.println(seat.getSeatNumber() + " (" + seat.getSeatClass() + ")");
        }
    }
}
