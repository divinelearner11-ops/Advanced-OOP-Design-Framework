#include <iostream>
#include "Course.h"
using namespace std;

Course::Course(string name, string code)
       : Course(name, code, 3, "Unknown") {} // constructor chaining , avoid code duplication

Course::Course(string name, string code, int c, string inst) {
    courseName = name;
    courseCode = code;
    credits = c;
    instructor = inst;
}

void Course::display() const {
    cout << courseName << " " 
    << courseCode << " " 
    << credits << " " 
    << instructor << endl;
}
