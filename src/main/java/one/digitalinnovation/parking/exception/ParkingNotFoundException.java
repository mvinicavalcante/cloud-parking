package one.digitalinnovation.parking.exception;

public class ParkingNotFoundException extends RuntimeException {

    public ParkingNotFoundException(String id) {
        super("Parking not found with Id: " + id);
    }

}
