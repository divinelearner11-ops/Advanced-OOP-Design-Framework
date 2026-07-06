#ifndef STUDENT_H
#define STUDENT_H

#include <iostream>
#include <string>
using namespace std;

class Student {
public:
    int rollNo;
    string name;
    int marks[5];

    void input();
    void display();
};

#endif