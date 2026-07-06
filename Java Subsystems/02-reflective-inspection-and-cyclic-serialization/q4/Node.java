import java.io.*;
import java.lang.reflect.Field;
import java.util.*;

public class Node implements Serializable {
    private static final long serialVersionUID = 1L;

    int id;
    Node next;

    public Node(int id) {
        this.id = id;
        this.next = null;
    }

    // Detect cycle using Floyd's algorithm (no serialization involved)
    public static boolean hasCycle(Node head) {
        if (head == null) return false;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    // Custom serialization: write all nodes avoiding infinite recursion.
    // We store them as a flat list of ids, then a separate cycleTarget id (-1 if none).
    private void writeObject(ObjectOutputStream oos) throws IOException {
        // Traverse the list, collect ids and detect cycle
        List<Integer> ids = new ArrayList<>();
        Set<Node> visited = new LinkedHashSet<>();
        Node cur = this;
        int cycleTargetId = -1;

        while (cur != null && !visited.contains(cur)) {
            visited.add(cur);
            ids.add(cur.id);
            cur = cur.next;
        }

        if (cur != null) {
            // cur is the cycle target
            cycleTargetId = cur.id;
        }

        oos.writeObject(ids);
        oos.writeInt(cycleTargetId);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        @SuppressWarnings("unchecked")
        List<Integer> ids = (List<Integer>) ois.readObject();
        int cycleTargetId = ois.readInt();

        if (ids.isEmpty()) return;

        // Rebuild nodes
        Map<Integer, Node> nodeMap = new LinkedHashMap<>();
        for (int nid : ids) {
            nodeMap.put(nid, new Node(nid));
        }

        // Link nodes
        List<Integer> idList = new ArrayList<>(ids);
        for (int i = 0; i < idList.size() - 1; i++) {
            nodeMap.get(idList.get(i)).next = nodeMap.get(idList.get(i + 1));
        }

        // Link last node to cycle target if cycle exists
        if (cycleTargetId != -1) {
            nodeMap.get(idList.get(idList.size() - 1)).next = nodeMap.get(cycleTargetId);
        }

        // Copy fields from rebuilt head into this object using reflection
        Node rebuilt = nodeMap.get(idList.get(0));
        try {
            Field idField = Node.class.getDeclaredField("id");
            Field nextField = Node.class.getDeclaredField("next");
            idField.setAccessible(true);
            nextField.setAccessible(true);
            idField.set(this, idField.get(rebuilt));
            nextField.set(this, nextField.get(rebuilt));
        } catch (Exception e) {
            throw new IOException("Failed to restore Node fields: " + e.getMessage());
        }
    }

    // Reflection-based equals: compare id and whether next refers to same structure
    // (does NOT follow next to avoid infinite loop on cycles; compares by id only for simplicity)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Node)) return false;
        try {
            Field idField = Node.class.getDeclaredField("id");
            idField.setAccessible(true);
            return idField.getInt(this) == idField.getInt(obj);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    // Print up to maxNodes nodes to avoid infinite loop
    public static String listToString(Node head, int maxNodes) {
        StringBuilder sb = new StringBuilder();
        Set<Node> seen = new LinkedHashSet<>();
        Node cur = head;
        int count = 0;
        while (cur != null && count < maxNodes) {
            if (seen.contains(cur)) {
                sb.append(" -> [cycle back to Node(").append(cur.id).append(")]");
                break;
            }
            seen.add(cur);
            sb.append("Node(").append(cur.id).append(")");
            cur = cur.next;
            count++;
            if (cur != null && !seen.contains(cur)) sb.append(" -> ");
        }
        return sb.toString();
    }
}
