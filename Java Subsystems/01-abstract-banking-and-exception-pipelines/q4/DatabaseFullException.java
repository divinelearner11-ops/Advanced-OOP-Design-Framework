public class DatabaseFullException extends Exception {
    public DatabaseFullException() {
        super("Database is full. Cannot add more than 50 students.");
    }
}
