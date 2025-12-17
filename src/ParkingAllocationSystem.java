import java.util.Scanner;

public class ParkingAllocationSystem {
    Scanner input = new Scanner(System.in);

    public ParkingAllocationSystem() {
        System.out.print("Welcome to the parking lot :D");

        try {
            System.out.print("Enter size of your vehicle: ");
            String vehicleSize = input.nextLine();

            System.out.print("Enter plate number: ");
            String plateNumber = input.nextLine();


            // check if any spots are available
            // get available spots for size of vehicle
            // match size of vehicle with size of parking lot


        } catch (NullPointerException e) {
            System.out.print(e.getMessage());
        }

    }

    public static void main(String[] args) {
        new ParkingAllocationSystem();
    }
}
