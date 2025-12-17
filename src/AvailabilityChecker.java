import java.util.List;
public class AvailabilityChecker {
    private final List<ParkingSpot> parkingSpots;
    public AvailabilityChecker(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public String findAvailableSpotParallelStream(String vehicleSize) {
        return parkingSpots.parallelStream()
                .filter(spot -> !spot.isOccupied() && spot.getSize().equals(vehicleSize))
                .map(ParkingSpot::getSpotId)
                .findFirst()
                .orElse(null);
    }
}