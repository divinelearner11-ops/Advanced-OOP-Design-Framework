#ifndef PROFESSOR_H
#define PROFESSOR_H

#include "Teacher.h"

/*
 Professor class inherits from Teacher
*/

class Professor : public Teacher {
    string designation;   // Designation of professor

public:
    // Constructor initializes Human, Teacher, and Professor data
    Professor(string n, int a, string s, string d);

    // Displays complete academic details
    void displayDetails();
};

#endif
