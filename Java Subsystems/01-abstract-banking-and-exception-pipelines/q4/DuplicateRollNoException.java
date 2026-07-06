public class DuplicateRollNoException extends Exception {
    public DuplicateRollNoException(int rollNo) {
        super("Student with roll number " + rollNo + " already exists.");
    }
}
