#include <iostream>
#include "Student.h"
using namespace std;

int main() {
    // object creation and constructor call
    Student s1;
    Student s2(101, "Surya");
    Student s3(102, "Shrutik", "CSE", 4);
    Student s4(103, "Jay", "CME", 5);
    Student s5(104, "Tejas", "Mech", 8);

    s1.display(); s1.isPromoted();
    s2.display(); s2.isPromoted();
    s3.display(); s3.isPromoted();
    s4.display(); s4.isPromoted();
    s5.display(); s5.isPromoted();

    return 0;
}
