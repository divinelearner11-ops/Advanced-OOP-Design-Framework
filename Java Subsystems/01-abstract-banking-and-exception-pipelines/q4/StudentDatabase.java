public class StudentDatabase {
    private Student[] students;
    private int count;
    private static final int MAX_SIZE = 50;

    public StudentDatabase() {
        students = new Student[MAX_SIZE];
        count = 0;
    }

    public void addStudent(Student s)
        throws DuplicateRollNoException, DatabaseFullException, InvalidRollNoException {
        if (s.getRollNo() < 1 || s.getRollNo() > 50) {
            throw new InvalidRollNoException(s.getRollNo());
        }
        if (count >= MAX_SIZE) {
            throw new DatabaseFullException();
        }
        for (int i = 0; i < count; i++) {
            if (students[i].getRollNo() == s.getRollNo()) {
                throw new DuplicateRollNoException(s.getRollNo());
            }
        }
        students[count++] = s;
        System.out.println("Student added successfully.");
    }

    public void displayAll() {
        if (count == 0) {
            System.out.println("No students in database.");
            return;
        }
        System.out.println("--- All Students ---");
        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    public void searchByRollNo(int rollNo) {
        for (int i = 0; i < count; i++) {
            if (students[i].getRollNo() == rollNo) {
                System.out.println("Student found:");
                students[i].display();
                return;
            }
        }
        System.out.println("No student found with roll number " + rollNo);
    }

    public int getCount() { return count; }
}
