public class Student {
    private int rollNo;
    private String name;
    private int[] marks; // 5 subjects

    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public int[] getMarks() { return marks; }

    public double getAverage() {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum / (double) marks.length;
    }

    public void display() {
        System.out.print("Roll No: " + rollNo + " | Name: " + name + " | Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("S" + (i + 1) + "=" + marks[i]);
            if (i < marks.length - 1) System.out.print(", ");
        }
        System.out.printf(" | Average: %.2f%n", getAverage());
    }
}
