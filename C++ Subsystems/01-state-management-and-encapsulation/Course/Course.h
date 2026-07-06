#ifndef COURSE_H
#define COURSE_H

#include <string>
using namespace std;

class Course {
private:
    string courseName;
    string courseCode;
    int credits;
    string instructor;

public:
// constructors
    Course(string name, string code); // partially parameterized
    Course(string name, string code, int c, string inst); // full parametrized
    
    void display() const;
};

#endif
