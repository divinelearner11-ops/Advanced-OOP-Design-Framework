#include "Research.h"

// Constructor: allocates memory and copies title
ResearchProject::ResearchProject(const char* title) {
    projectTitle = new char[strlen(title) + 1];
    strcpy(projectTitle, title);
}

// Deep copy constructor
ResearchProject::ResearchProject(const ResearchProject& rp) {
    projectTitle = new char[strlen(rp.projectTitle) + 1];
    strcpy(projectTitle, rp.projectTitle);
}

// Destructor: releases allocated memory
ResearchProject::~ResearchProject() {
    delete[] projectTitle;
}

// Displays project title
void ResearchProject::displayProject() {
    cout << "Project Title: " << projectTitle << endl;
}

int main() {
    ResearchProject r1("Use of AI in Share Market");
    ResearchProject r2 = r1;   // Invokes deep copy constructor

    r1.displayProject();
    r2.displayProject();

    return 0;
}
