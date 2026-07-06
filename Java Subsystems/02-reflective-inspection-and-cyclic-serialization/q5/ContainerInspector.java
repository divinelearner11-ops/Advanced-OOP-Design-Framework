import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ContainerInspector {

    public static void getContainerInfo(Object container) {
        System.out.println("Container class: " + container.getClass().getName());

        if (container instanceof Map) {
            Map<?, ?> map = (Map<?, ?>) container;
            System.out.println("Type: Map");
            System.out.println("Size: " + map.size());
            System.out.println("Keys and Values:");
            try {
                // Use reflection to invoke keySet() and values()
                Method keySetMethod = container.getClass().getMethod("keySet");
                Method valuesMethod = container.getClass().getMethod("values");
                Object keys = keySetMethod.invoke(container);
                Object vals = valuesMethod.invoke(container);
                System.out.println("  Keys:   " + keys);
                System.out.println("  Values: " + vals);
            } catch (Exception e) {
                System.out.println("Reflection error: " + e.getMessage());
            }
        } else if (container instanceof List) {
            List<?> list = (List<?>) container;
            System.out.println("Type: List");
            System.out.println("Size: " + list.size());
        } else if (container instanceof Set) {
            Set<?> set = (Set<?>) container;
            System.out.println("Type: Set");
            System.out.println("Size: " + set.size());
        } else {
            System.out.println("Unknown container type.");
        }
    }
}
