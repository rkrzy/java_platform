package Weekend_8.Cafe_0706;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<>();

    private static int orderCounter = 1;
    private int orderNo;
    private Order.PickUp delivery;

    public static interface PickUp {
        public abstract void handle(Order o);
    }

    public void completed() {

    }

    public void addItem(OrderItem chamomile) {
    }


    public void setPickUp(Order.PickUp pickUp) {
    }

    // your code here

}