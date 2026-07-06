#include "Student.h"

int main() {

    Student* s = new Student(65, "Ankit");

    s->display();

    delete s;

    return 0;
}
