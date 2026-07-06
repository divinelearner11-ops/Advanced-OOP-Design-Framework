import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Inventory implements Serializable {
    private static final long serialVersionUID = 1L;

    private HashMap<Integer, Product> products = new HashMap<>();

    public void addProduct(Product p) throws ProductAlreadyExistsException {
        if (products.containsKey(p.getCode())) {
            throw new ProductAlreadyExistsException(
                "Product with code " + p.getCode() + " already exists."
            );
        }
        products.put(p.getCode(), p);
    }

    public void updateStock(int code, int newStock) throws ProductNotFoundException {
        if (!products.containsKey(code)) {
            throw new ProductNotFoundException(
                "Product with code " + code + " not found."
            );
        }
        products.get(code).setStock(newStock);
    }

    public void displayAll() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        for (Product p : products.values()) {
            System.out.println("  " + p);
        }
    }

    public HashMap<Integer, Product> getProducts() {
        return products;
    }
}
