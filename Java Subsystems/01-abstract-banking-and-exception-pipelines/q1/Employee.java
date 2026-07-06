public class Employee {
    private int empId;
    private String name;
    private double basicSalary;

    private static String companyName;

    public Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public static void setCompanyName(String name) {
        companyName = name;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public int getEmpId() { return empId; }
    public String getName() { return name; }
    public double getBasicSalary() { return basicSalary; }

    public double calculateSalary() {
        double bonus;
        if (basicSalary > 50000) {
            bonus = basicSalary * 0.10;
        } else {
            bonus = basicSalary * 0.05;
        }
        return basicSalary + bonus;
    }
}
