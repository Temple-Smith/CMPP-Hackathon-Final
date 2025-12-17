import exceptions.ParkingOverflowException;
import exceptions.SpotUnavailableException;
import model.ParkingLot;
import model.ParkingSpot;
import model.Vehicle;

public class ParkingAllocator{
    private final ParkingLot parkingLot;
    private final AvailabilityChecker availabilityChecker;

    public ParkingAllocator(){
        this.parkingLot = ParkingLot;
        this.availabilityChecker = new AvailabilityChecker();

        public ParkingSpot assignSpot(Vehicle v) throws ParkingOverflowException, SpotUnavailableException{
            ParkingSpot parkingSpot = availabilityChecker.findAvailableSpot(v);
            if(parkingSpot == null){
                throw new ParkingOverflowException("Parking spot not available for this vehicle: "+ v);
                
            }
            boolean successFullyOccupy = parkingSpot.occupySpot();
            if(!successFullyOccupy){
                throw new SpotUnavailableException("Parking Spot is occupied. Try again later.");
            }
            return parkingSpot;
        }
    }
    
}
