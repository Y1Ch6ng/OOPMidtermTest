import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Passenger {
    private String passengerID;
    private String name;
    private String passportNumber;
    private String email;
    private String phoneNumber;
    private ArrayList<Reservation> reservations;

    public Passenger(String passengerID, String name, String passportNumber, String email, String phoneNumber) {
        this.passengerID = passengerID;
        this.name = name;
        this.passportNumber = passportNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.reservations = new ArrayList<>();
    }

    public Reservation createReservation(Flight flight, Seat seat) {
        if (!seat.isAvailable()) {
            return null; // Seat is not available.
        }
        String reservationID = generateRandomString(8);
        Reservation reservation = new Reservation(reservationID, flight, seat, this, LocalDate.now());
        reservations.add(reservation);
        seat.setAvailability(false); // Mark the seat as reserved.
        return reservation;
    }

    private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder result = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }

    // Getter methods
    public String getPassengerID() {
        return passengerID;
    }

    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}
