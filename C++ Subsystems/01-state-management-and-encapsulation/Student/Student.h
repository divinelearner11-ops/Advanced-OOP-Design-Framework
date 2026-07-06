#ifndef STUDENT_H
#define STUDENT_H

#include <string>
using namespace std;

class Student {
private:
// data members
    int rollNumber;
    string name;
    string branch;
    int semester;

public:
// constructors
    Student();  // default
    Student(int roll, string name); // partially parameterized
    Student(int roll, string name, string branch, int sem); // parametrized

    void isPromoted() const;
    void display() const;
};

#endif
