#include "Employee.h"

int main() {

    // Creating heterogeneous array of base class pointers
    Employee* company[4];

    company[0] = new Employee("Surya", 101, 41500);
    company[1] = new Manager("Jay", 102, 60070, 8);
    company[2] = new Developer("Tejas", 103, 50400, 6);
    company[3] = new TeamLead("Sahil", 104, 100200, 5, 10);

    float totalPayroll = 0;

    cout << " Company Payroll Details " << endl;

    for (int i = 0; i < 4; i++) {
        company[i]->displayDetails();  // Runtime Polymorphism
        totalPayroll += company[i]->calculateSalary();
    }

    cout << "\n Total Company Payroll: $" << totalPayroll << "\n";

    // Cleanup
    for (int i = 0; i < 4; i++) {
        delete company[i];
    }

    return 0;
}
