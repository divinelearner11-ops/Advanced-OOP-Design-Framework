import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static StudentDatabase db = new StudentDatabase();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nStudent Database Menu ");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
                choice = 0;
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: addStudent(); break;
                case 2: db.displayAll(); break;
                case 3: searchStudent(); break;
                case 4: System.out.println("Exiting."); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }

    private static void addStudent() {
        System.out.print("Enter Roll No: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid roll number.");
            sc.next();
            return;
        }
        int rollNo = sc.nextInt();
        sc.nextLine();
        try {
            if (rollNo < 1 || rollNo > 50) {
            throw new InvalidRollNoException(rollNo);
        }
        } catch (InvalidRollNoException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects (0-100):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid marks input.");
                sc.next();
                return;
            }
            int m = sc.nextInt();
            try {
                if (m < 0 || m > 100) {
                    throw new InvalidMarksException(m, i + 1);
                }
                marks[i] = m;
            } catch (InvalidMarksException e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
                return;
            }
        }
        sc.nextLine();

        try {
            Student s = new Student(rollNo, name, marks);
            db.addStudent(s);
        } catch (DuplicateRollNoException | DatabaseFullException | InvalidRollNoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void searchStudent() {
        System.out.print("Enter Roll No to search: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid roll number.");
            sc.next();
            return;
        }
        int rollNo = sc.nextInt();
        sc.nextLine();
        db.searchByRollNo(rollNo);
    }
}
