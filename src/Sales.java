import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Lawrence on 10/17/15.
 */
public class Sales implements Iterable<Order> {
    private ArrayList<Order> orders;
    public Sales() {
        orders = new ArrayList<>();
    }
    public void addOrder(Order order) {
        orders.add(order);
    }
    public Iterator<Order> iterator() {
        return orders.iterator();
    }
    public int getNumberOfOrders() {
        return orders.size();
    }
}
