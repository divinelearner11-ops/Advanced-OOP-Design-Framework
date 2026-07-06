import java.io.*;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        // Build: 1 -> 2 -> 3 -> 4 -> (back to 2, forming a cycle)
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2; // cycle: 4 points back to 2

        System.out.println("Original list (up to 8 nodes): " + Node.listToString(n1, 8));
        System.out.println("Has cycle (original): " + Node.hasCycle(n1));

        // Serialize
        String filename = "nodes.ser";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(n1);
            System.out.println("Serialized to " + filename);
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
            return;
        }

        // Deserialize
        Node loaded = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            loaded = (Node) ois.readObject();
            System.out.println("Deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
            return;
        }

        System.out.println("Deserialized list (up to 8 nodes): " + Node.listToString(loaded, 8));
        System.out.println("Has cycle (deserialized): " + Node.hasCycle(loaded));

        // Reflection-based comparison of two deserialized nodes
        System.out.println("\nReflection-based equals comparison:");
        try {
            Field idField = Node.class.getDeclaredField("id");
            idField.setAccessible(true);
            System.out.println("Original head id: " + idField.get(n1));
            System.out.println("Deserialized head id: " + idField.get(loaded));
            System.out.println("equals(n1, loaded head): " + n1.equals(loaded));
        } catch (Exception e) {
            System.out.println("Reflection error: " + e.getMessage());
        }

        // Test without cycle
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        a.next = b;
        b.next = c;
        System.out.println("\nLinear list (no cycle): " + Node.listToString(a, 10));
        System.out.println("Has cycle (linear): " + Node.hasCycle(a));
    }
}
