#ifndef RESEARCH_H
#define RESEARCH_H

#include <iostream>
#include <cstring>
using namespace std;

/*
 ResearchProject class
 Deep copy using dynamic memory allocation
*/
class ResearchProject {
    char* projectTitle;   // Dynamically allocated project title

public:
    // Constructor
    ResearchProject(const char* title);

    // Copy constructor (Deep Copy)
    ResearchProject(const ResearchProject& rp);

    // Destructor
    ~ResearchProject();

    // Displays project title
    void displayProject();
};

#endif
