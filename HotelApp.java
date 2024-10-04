import java.util.*;

public class HotelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for valet service
        System.out.print("Enter your vehicle's plate number: ");
        String plateNumber = scanner.nextLine();
        Valet valet = new Valet(plateNumber);

        // User input for housekeeping service
        System.out.print("Enter your room number: ");
        int roomNumber = scanner.nextInt();

        HouseKeeping houseKeeping = new HouseKeeping(roomNumber);

        // User input for luggage cart service
        System.out.print("Enter the number of luggage carts you need: ");
        int numberOfCarts = scanner.nextInt();
        Cart cart = new Cart(numberOfCarts);

        // Using FrontDesk facade to handle services
        FrontDesk frontDesk = new FrontDesk(valet, houseKeeping, cart);

        System.out.println("\nProcessing your requests...");

        // Perform the requested services
        frontDesk.handleValetService();
        frontDesk.handleHouseKeepingService();
        frontDesk.handleCartService();

        scanner.close();
    }
}