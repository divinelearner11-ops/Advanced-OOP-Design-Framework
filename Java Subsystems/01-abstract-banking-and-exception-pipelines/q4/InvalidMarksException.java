public class InvalidMarksException extends Exception {
    public InvalidMarksException(int marks, int subject) {
        super("Invalid marks " + marks + " for subject " + subject + ". Marks must be between 0 and 100.");
    }
}
