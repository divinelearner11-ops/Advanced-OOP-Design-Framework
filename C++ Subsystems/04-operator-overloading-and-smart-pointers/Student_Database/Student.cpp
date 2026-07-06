#include "Student.h"

void Student::input() {
    cout << "Enter Roll Number: ";
    cin >> rollNo;

    cout << "Enter Name: ";
    cin >> name;

    cout << "Enter marks of 5 subjects:\n";
    for(int i=0;i<5;i++) cin >> marks[i];
}

void Student::display() {
    cout << "Roll No: " << rollNo << endl;
    cout << "Name: " << name << endl;

    cout << "Marks: ";
    for(int i=0;i<5;i++) cout << marks[i] << " ";
    cout << endl;
}