import java.util.List;


public class ParkingLot {
    private List<ParkingSpot> parkingSpots;
    // Create a ParkingLot with a list of ParkingSpots
    public ParkingLot(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
    // Find an available parking spot for a given vehicle
    public ParkingSpot findAvailableSpot(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied() && spot.canFit(vehicle)) {
                return spot;
            }
        }
        return null; // No available spot found
    }

    public boolean parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = findAvailableSpot(vehicle);
        if (spot != null) {
            spot.occupySpot();
            return true; // Vehicle parked 
        }
        return false; // No available spot
    }

    public void releaseSpot(String spotId) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getSpotId().equals(spotId)) {
                spot.releaseSpot();
                break;
            }
        }
    }
}
