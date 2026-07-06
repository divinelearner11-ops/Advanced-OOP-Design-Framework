#include <iostream>
#include "Student.h"
using namespace std;

Student::Student() {
    rollNumber = 0;
    name = "Null";
    branch = "Null";
    semester = 0;
}

Student::Student(int roll, string n) {
    rollNumber = roll;
    name = n;
    branch = "General";
    semester = 1;
}

Student::Student(int roll, string n, string b, int sem) {
    rollNumber = roll;
    name = n;
    branch = b;
    semester = sem;
}

void Student::isPromoted() const {
    if (semester >= 1 && semester <= 7)
        cout << "Eligible for next semester\n";
    else if (semester == 8)
        cout << "Ready for graduation\n";
}

void Student::display() const {
    cout << rollNumber << " " << name << " " << branch << " " << semester << endl;
}
