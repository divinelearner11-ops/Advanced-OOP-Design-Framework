#include "Student.h"
#include <cstdlib>

Student::Student(int i, string n) {

    id = i;
    name = n;
}

void Student::display() {

    cout << "ID: " << id << endl;
    cout << "Name: " << name << endl;
}

void* Student::operator new(size_t size) {

    cout << "Allocating memory for Student object" << endl;

    void* ptr = malloc(size);

    if(!ptr) {
        cout << "Memory allocation failed" << endl;
        exit(1);
    }

    return ptr;
}

void Student::operator delete(void* ptr) {

    cout << "Deallocating memory for Student object" << endl;

    free(ptr);
}