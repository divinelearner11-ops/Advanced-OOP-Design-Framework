#include <iostream>
#include "Professor.h"
using namespace std;

// Human constructor definition
Human::Human(string n, int a) : name(n), age(a) {}

// Teacher constructor definition
Teacher::Teacher(string n, int a, string s)
    : Human(n, a), subject(s) {}

// Professor constructor definition
Professor::Professor(string n, int a, string s, string d)
    : Teacher(n, a, s), designation(d) {}

// Displays all inherited data members
void Professor::displayDetails() {
    cout << "Name: " << name << endl;
    cout << "Age: " << age << endl;
    cout << "Subject: " << subject << endl;
    cout << "Designation: " << designation << endl;
}

int main() {
    // Creating object of most derived class
    Professor p("Dr. Surya", 45, "Computer Science & Engineering", "Professor");

    // Demonstrates multilevel inheritance
    p.displayDetails();

    return 0;
}
