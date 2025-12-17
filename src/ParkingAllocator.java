import exceptions.ParkingOverflowException;
import exceptions.SpotUnavailableException;

import java.util.List;

public class ParkingAllocator {
    private final List<ParkingSpot> parkingLot;
    private final AvailabilityChecker availabilityChecker;

    public ParkingAllocator(List<ParkingSpot> parkingLot) {
        this.parkingLot = parkingLot;
        this.availabilityChecker = new AvailabilityChecker(parkingLot);
    }

    public ParkingSpot assignSpot(Vehicle v) throws ParkingOverflowException, SpotUnavailableException {
        for (ParkingSpot spot : parkingLot) {
            if (v.getSize().equals(spot.getSize())) {
                spot.occupySpot();
            } else {
                throw new ParkingOverflowException("Parking spot not available for this vehicle: "+ v);
            }
        }

        boolean successFullyOccupy = parkingSpot.isOccupied();

        if(!successFullyOccupy){
            throw new SpotUnavailableException("Parking Spot is occupied. Try again later.");
        }
        return parkingSpot;
    }

}
