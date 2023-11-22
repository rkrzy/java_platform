package Weekend_8.Cafe_0706;

public class OrderItem {
    private Beverage beverage;
    private int quantity;

    public OrderItem(Beverage beverage, int quantity) {
        this.beverage = beverage;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return beverage.toString() + ", quantity=" + quantity ;
    }
}