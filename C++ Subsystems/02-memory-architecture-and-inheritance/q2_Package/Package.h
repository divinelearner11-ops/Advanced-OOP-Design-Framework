#ifndef PACKAGE_H
#define PACKAGE_H

#include <iostream>
using namespace std;

/*
 Package class
 Constructor overloading and copy constructor
*/
class Package {
    int length, width, height;  // Dimensions of the package

public:
    Package();                              // Default constructor
    Package(int l, int w, int h);           // Parameterized constructor
    Package(const Package& p);              // Copy constructor
    void display();                         // Display dimensions
};

#endif
