package exceptions;

public class ParkingOverflowException extends RuntimeException {
    public ParkingOverflowException(String message) {
        super(message);
    }
}
