import java.io.*;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add products
        try {
            inventory.addProduct(new Product(101, "Pen", 200));
            inventory.addProduct(new Product(102, "Notebook", 150));
            inventory.addProduct(new Product(103, "Eraser", 500));
            System.out.println("Products added successfully.");
        } catch (ProductAlreadyExistsException e) {
            System.out.println("Add error: " + e.getMessage());
        }

        // Try adding duplicate
        try {
            inventory.addProduct(new Product(101, "Pen Duplicate", 50));
        } catch (ProductAlreadyExistsException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }

        // Update stock
        try {
            inventory.updateStock(102, 300);
            System.out.println("Stock updated for code 102.");
        } catch (ProductNotFoundException e) {
            System.out.println("Update error: " + e.getMessage());
        }

        // Try updating non-existent
        try {
            inventory.updateStock(999, 100);
        } catch (ProductNotFoundException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }

        System.out.println("\nCurrent inventory:");
        inventory.displayAll();

        // Serialize
        String filename = "inventory.ser";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(inventory);
            System.out.println("\nInventory serialized to " + filename);
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
            return;
        }

        // Deserialize
        Inventory loaded = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            loaded = (Inventory) ois.readObject();
            System.out.println("Inventory deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            try {
                throw new InventoryLoadException("Failed to load inventory from file.", e);
            } catch (InventoryLoadException ile) {
                System.out.println("InventoryLoadException: " + ile.getMessage());
                return;
            }
        }

        System.out.println("\nDeserialized inventory:");
        loaded.displayAll();

        // Inspect container via reflection
        System.out.println("\nContainer inspection of deserialized inventory:");
        ContainerInspector.getContainerInfo(loaded.getProducts());
    }
}
