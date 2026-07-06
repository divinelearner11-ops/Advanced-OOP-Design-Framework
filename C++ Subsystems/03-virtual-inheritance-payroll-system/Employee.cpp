#include "Employee.h"

// EMPLOYEE

Employee::Employee(string n, int id, float salary)
    : name(n), employeeID(id), baseSalary(salary) {}

Employee::~Employee() {
    cout << "Destructor called for Employee: " << name << endl;
}

float Employee::calculateBonus() {
    // Default Bonus = 5%
    return 0.05 * baseSalary;
}

float Employee::calculateSalary() {
    return baseSalary + calculateBonus();
}

void Employee::displayDetails() {
    cout << "\nEmployee Name: " << name
         << "\nEmployee ID: " << employeeID
         << "\nBase Salary: $" << baseSalary << endl;
}


// MANAGER 

Manager::Manager(string n, int id, float salary, int team)
    : Employee(n, id, salary), teamSize(team) {}

float Manager::calculateBonus() {
    // 10% of base + $100 per team member
    return (0.10 * baseSalary) + (100 * teamSize);
}

float Manager::calculateSalary() {
    // base + bonus + management allowance
    return baseSalary + calculateBonus() + 5000;
}

void Manager::displayDetails() {
    Employee::displayDetails();  // Scope resolution
    cout << "Role: Manager"
         << "\nTeam Size: " << teamSize
         << "\nBonus: $" << calculateBonus()
         << "\nTotal Salary: $" << calculateSalary()
         << endl;
}


//DEVELOPER

Developer::Developer(string n, int id, float salary, int projects)
    : Employee(n, id, salary), projectsCompleted(projects) {}

float Developer::calculateBonus() {
    // $500 per project
    return 500 * projectsCompleted;
}

float Developer::calculateSalary() {
    return baseSalary + calculateBonus();
}

void Developer::displayDetails() {
    Employee::displayDetails();
    cout << "Role: Developer"
         << "\nProjects Completed: " << projectsCompleted
         << "\nBonus: $" << calculateBonus()
         << "\nTotal Salary: $" << calculateSalary()
         << endl;
}


//TEAM LEAD

TeamLead::TeamLead(string n, int id, float salary,int team, int projects)
    : Employee(n, id, salary),   // ONLY ONE Employee object
      Manager(n, id, salary, team),
      Developer(n, id, salary, projects) {}

float TeamLead::calculateBonus() {
    // Take maximum bonus of Manager or Developer
    float managerBonus = Manager::calculateBonus();
    float developerBonus = Developer::calculateBonus();

    return (managerBonus > developerBonus) ? managerBonus : developerBonus;
}

float TeamLead::calculateSalary() {
    // base salary counted ONCE
    return baseSalary + calculateBonus() + 5000 + 3000;
}

void TeamLead::displayDetails() {
    Employee::displayDetails();
    cout << "Role: Team Lead"
         << "\nTeam Size: " << teamSize
         << "\nProjects Completed: " << projectsCompleted
         << "\nChosen Bonus (Max): $" << calculateBonus()
         << "\nTechnical Allowance: $3000"
         << "\nManagement Allowance: $5000"
         << "\nTotal Salary: $" << calculateSalary()
         << endl;
}
