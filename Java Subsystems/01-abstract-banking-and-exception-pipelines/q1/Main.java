public class Main {
    public static void main(String[] args) {
        Employee.setCompanyName("AK corp ltd");

        Employee[] employees = {
            new Employee(1, "Shrutik",   60000),
            new Employee(2, "Jay",     45000),
            new Employee(3, "Tejas", 50000),
            new Employee(4, "Sahil",   80000),
            new Employee(5, "Aryan",     30000)
        };

        System.out.println("Company: " + Employee.getCompanyName());
        System.out.println("\n");
        System.out.printf("%-5s %-10s %-12s %-12s%n", "ID", "Name", "Basic Salary", "Total Salary");
        System.out.println("\n");

        for (Employee e : employees) {
            System.out.printf("%-5d %-10s %-12.2f %-12.2f%n",
                e.getEmpId(), e.getName(), e.getBasicSalary(), e.calculateSalary());
        }
    }
}
