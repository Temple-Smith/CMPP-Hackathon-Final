public class ParkingSpot {
    private String spotId;
    private boolean isOccupied;
    private String size; // e.g., "compact", "regular", "large"

    public ParkingSpot(String spotId, String size) {
        this.spotId = spotId;
        this.size = size;
        this.isOccupied = false;
    }

    public String getSpotId() {
        return spotId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void occupySpot() {
        isOccupied = true;
    }

    public void vacateSpot() {
        isOccupied = false;
    }
}