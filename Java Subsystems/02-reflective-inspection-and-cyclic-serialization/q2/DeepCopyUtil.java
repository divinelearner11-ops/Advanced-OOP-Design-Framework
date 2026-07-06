import java.lang.reflect.Field;

public class DeepCopyUtil {

    public static Object deepCopy(Object obj) throws Exception {
        if (obj == null) return null;

        Class<?> clazz = obj.getClass();

        // Create new instance using no-arg constructor
        Object copy = clazz.getDeclaredConstructor().newInstance();

        // Copy all declared fields, including private
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            Object value = field.get(obj);
            field.set(copy, value);
        }

        return copy;
    }
}
