import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private int rollNo;
    private String name;
    private int[] grades;

    public Student(int rollNo, String name, int[] grades) {
        this.rollNo = rollNo;
        this.name = name;
        this.grades = grades;
    }

    public double calculateAverage() {
        if (grades == null || grades.length == 0) return 0;
        int sum = 0;
        for (int g : grades) sum += g;
        return (double) sum / grades.length;
    }

    public int highestGrade() {
        if (grades == null || grades.length == 0) return 0;
        int max = grades[0];
        for (int g : grades) {
            if (g > max) max = g;
        }
        return max;
    }

    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public int[] getGrades() { return grades; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{rollNo=").append(rollNo)
          .append(", name=").append(name)
          .append(", grades=[");
        for (int i = 0; i < grades.length; i++) {
            sb.append(grades[i]);
            if (i < grades.length - 1) sb.append(", ");
        }
        sb.append("]}");
        return sb.toString();
    }
}
