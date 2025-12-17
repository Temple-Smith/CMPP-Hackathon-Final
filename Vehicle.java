public class Vehicle {
    private String licensePlate;
    private String size; // e.g., "compact", "regular", "large"

    public Vehicle(String licensePlate, String size) {
        this.licensePlate = licensePlate;
        this.size = size;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getSize() {
        return size;
    }
}