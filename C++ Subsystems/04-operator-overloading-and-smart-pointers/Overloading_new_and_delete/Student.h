#ifndef STUDENT_H
#define STUDENT_H

#include <iostream>
#include <string>

using namespace std;

class Student {

    int id;
    string name;

public:

    Student(int i, string n);

    void display();

    void* operator new(size_t size);

    void operator delete(void* ptr);
};

#endif