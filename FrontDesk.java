public class FrontDesk {
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDesk(Valet valet, HouseKeeping houseKeeping, Cart cart) {
        this.valet = valet;
        this.houseKeeping = houseKeeping;
        this.cart = cart;
    }

    public void handleValetService() {
        valet.performService();
    }

    public void handleHouseKeepingService() {
        houseKeeping.performService();
    }

    public void handleCartService() {
        cart.performService();
    }
}