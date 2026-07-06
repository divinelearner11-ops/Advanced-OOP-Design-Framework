#ifndef HUMAN_H
#define HUMAN_H

#include <string>
using namespace std;

/*
 Base class Human
 Stores basic human information
*/
class Human {
protected:
    string name;   // Name of the human
    int age;       // Age of the human

public:
    // Parameterized constructor to initialize name and age
    Human(string n, int a);
};

#endif
