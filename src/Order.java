import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Lawrence on 10/17/15.
 */
public class Order {
    private ArrayList<OrderItem> items;
    public Order() {
        items  = new ArrayList<>();
    }
    public void addItem(OrderItem orderItem) {
        items.add(orderItem);
    }
    public void removeItem(OrderItem orderItem) {
        items.remove(orderItem);
    }
    public Iterator<OrderItem> iterator() {
        return items.iterator();
    }
    public OrderItem getItem(Product product) {
        for (OrderItem item : items) {
            if (item.getProduct().equals(product)) return item;
        }
        return null;
    }
    public int getNumberOfItems() {
        return items.size();
    }
    public double getTotalCost() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getValue();
        }
        return total;
    }
}
