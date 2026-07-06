import java.lang.reflect.Method;

public class AnnotationProcessor {

    public static void processImportant(Object obj) {
        Class<?> clazz = obj.getClass();
        System.out.println("Processing @Important methods of: " + clazz.getName());

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Important.class)) {
                System.out.print("  Invoking @Important method: " + method.getName() + "() -> ");
                try {
                    method.setAccessible(true);
                    Object result = method.invoke(obj);
                    System.out.println(result);
                } catch (Exception e) {
                    System.out.println("Error invoking " + method.getName() + ": " + e.getMessage());
                }
            }
        }
    }
}
