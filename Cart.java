public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void performService() {
        requestCart(numberOfCarts);
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("Number of Client's Cart: "+ numberOfCarts + "\nStatus: Requested!\n");
    }
}