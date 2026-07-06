#ifndef EMPLOYEE_H
#define EMPLOYEE_H

#include <iostream>
#include <string>
using namespace std;

/*
   Base Class: Employee
   Contains common data and virtual functions.
*/

class Employee {
public:
    string name;
    int employeeID;
    float baseSalary;

public:
    Employee(string n, int id, float salary);
    virtual ~Employee();   // Virtual destructor for proper cleanup

    // Virtual functions
    virtual float calculateBonus();     
    virtual float calculateSalary();    
    virtual void displayDetails();      
};


/*
   Manager class
   Uses VIRTUAL inheritance to solve Diamond Problem
*/

class Manager : virtual public Employee {
protected:
    int teamSize;

public:
    Manager(string n, int id, float salary, int team);

    float calculateBonus() override;
    float calculateSalary() override;
    void displayDetails() override;
};


/*
   Developer class
   Uses VIRTUAL inheritance
*/

class Developer : virtual public Employee {
protected:
    int projectsCompleted;

public:
    Developer(string n, int id, float salary, int projects);

    float calculateBonus() override;
    float calculateSalary() override;
    void displayDetails() override;
};


/*
   TeamLead class
   Multiple inheritance from Manager & Developer
   Diamond resolved via virtual inheritance
*/

class TeamLead : public Manager, public Developer {

public:
    TeamLead(string n, int id, float salary,
             int team, int projects);

    float calculateBonus() override;
    float calculateSalary() override;
    void displayDetails() override;
};

#endif
