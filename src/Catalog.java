import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Lawrence on 10/17/15.
 */
public class Catalog implements Iterable<Product> {
    private ArrayList<Product> products;
    public Catalog() {
        products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public Iterator<Product> iterator() {
        return products.iterator();
    }
    public Product getProduct(String code) {
        for (Product product : products) {
            if (code.equals(product.getCode())) return product;
        }
        return null;
    }
    public int getNumberOfProducts() {
        return products.size();
    }
}
