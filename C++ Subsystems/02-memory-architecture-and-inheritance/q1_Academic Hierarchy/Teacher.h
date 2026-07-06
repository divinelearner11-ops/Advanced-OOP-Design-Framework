#ifndef TEACHER_H
#define TEACHER_H

#include "Human.h"

/*
 Teacher class inherits from Human
 Adds subject information
*/
class Teacher : public Human {
protected:
    string subject;   // Subject taught by teacher

public:
    // Constructor initializes Human and Teacher data
    Teacher(string n, int a, string s);
};

#endif
