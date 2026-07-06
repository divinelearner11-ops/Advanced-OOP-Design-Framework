#include "StudentDatabase.h"
#include <iostream>
using namespace std;

StudentDatabase::StudentDatabase() {
    count = 0;
}

void StudentDatabase::addStudent(Student s)
{
    if(count >= 50)
        throw DatabaseFullException();

    // Check invalid roll number
    if(s.rollNo <= 0)
        throw InvalidRollNumberException();

    for(int i = 0; i < count; i++)
    {
        if(students[i].rollNo == s.rollNo)
            throw DuplicateRollNoException();
    }

    for(int i = 0; i < 5; i++)
    {
        if(s.marks[i] < 0 || s.marks[i] > 100)
            throw InvalidMarksException();
    }

    students[count++] = s;
}

void StudentDatabase::displayStudents() {

    if(count == 0){
        cout << "Database empty\n";
        return;
    }

    for(int i=0;i<count;i++){
        students[i].display();
        cout << endl;
    }
}

void StudentDatabase::searchStudent(int roll) {

    for(int i=0;i<count;i++){
        if(students[i].rollNo == roll){
            students[i].display();
            return;
        }
    }

    cout << "Student not found\n";
}
