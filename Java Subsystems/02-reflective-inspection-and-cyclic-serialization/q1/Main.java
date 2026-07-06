import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] grades = {86, 99, 70, 95, 81};
        Student original = new Student(101, "Ankit", grades);

        System.out.println("Original student: " + original);
        System.out.println("Average grade: " + original.calculateAverage());
        System.out.println("Highest grade: " + original.highestGrade());

        // Serialize
        String filename = "student.ser";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(original);
            System.out.println("Serialized to " + filename);
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
            return;
        }

        // Deserialize
        Student loaded = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            loaded = (Student) ois.readObject();
            System.out.println("Deserialized student: " + loaded);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
            return;
        }

        // Verify grades array restored correctly
        System.out.println("Grades array restored correctly: " + Arrays.equals(original.getGrades(), loaded.getGrades()));
        System.out.println("Average after deserialization: " + loaded.calculateAverage());
        System.out.println("Highest after deserialization: " + loaded.highestGrade());
    }
}
