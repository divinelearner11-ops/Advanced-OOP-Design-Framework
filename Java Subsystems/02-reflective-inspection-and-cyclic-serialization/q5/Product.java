import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private int code;
    private String name;
    private int stock;

    public Product(int code, String name, int stock) {
        this.code = code;
        this.name = name;
        this.stock = stock;
    }

    public int getCode() { return code; }
    public String getName() { return name; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return "Product{code=" + code + ", name=" + name + ", stock=" + stock + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        return this.code == other.code;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(code);
    }
}
