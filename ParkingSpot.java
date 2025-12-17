public class ParkingSpot {
    private String spotId;
    private boolean occupied;
    private String size; // e.g., "compact", "regular", "large"

    public ParkingSpot(String spotId, String size) {
        this.spotId = spotId;
        this.size = size;
        this.occupied = false;
    }

    public String getSpotId() {
        return spotId;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void occupySpot() {
        occupied = true;
    }

    public void releaseSpot() {
        occupied = false;
    }

    public String getSize() {
        return size;
    }

    public Boolean canFit(Vehicle vehicle) {
        // Check if the parking spot can fit the vehicle based on size
        return this.size.equals(vehicle.getSize());
    }
}