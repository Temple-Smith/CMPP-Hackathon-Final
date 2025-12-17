import java.util.ArrayList;
import java.util.Scanner;


public class ParkingAllocationSystem {
    Scanner input = new Scanner(System.in);
    ArrayList<ParkingSpot> parkingSpots = new ArrayList<>();
    ParkingLot parkingLot = new ParkingLot(parkingSpots);

    ParkingAllocator parkingAllocator = new ParkingAllocator(parkingSpots);

    public void loadSampleData() {
        ParkingSpot p1 = new ParkingSpot("P1", "compact");
        ParkingSpot p2 = new ParkingSpot("P2", "large");

        parkingSpots.add(p1);
        parkingSpots.add(p2);
    }


    public ParkingAllocationSystem() throws NullPointerException {
        System.out.print("Welcome to the parking lot :D");

        try {
            System.out.print("Enter size of your vehicle: ");
            String vehicleSize = input.nextLine();

            System.out.print("Enter plate number: ");
            String plateNumber = input.nextLine();


            // check if any spots are available
            // get available spots for size of vehicle
            // match size of vehicle with size of parking lot

            Vehicle vehicle = new Vehicle(plateNumber, vehicleSize);


            // if the parking lot is not empty, check for an available parking space
            if (!parkingLot.getParkingSpots().isEmpty()) {
                parkingAllocator.assignSpot(vehicle);
            } else {
                if (parkingLot.findAvailableSpot(vehicle) == null) {
                    System.out.print("No available spot found");
                }
            }


        } catch (NullPointerException e) {
            System.out.print(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new ParkingAllocationSystem();
    }
}
