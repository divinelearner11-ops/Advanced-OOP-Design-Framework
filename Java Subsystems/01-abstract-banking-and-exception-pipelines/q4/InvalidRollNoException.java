public class InvalidRollNoException extends Exception {
    public InvalidRollNoException(int rollNo) {
        super("Invalid roll number " + rollNo + ". Roll number must be between 1 and 50 (inclusive).");
    }
}