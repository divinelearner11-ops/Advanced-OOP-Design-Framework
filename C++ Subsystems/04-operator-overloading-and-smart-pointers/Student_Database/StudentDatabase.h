#ifndef STUDENTDATABASE_H
#define STUDENTDATABASE_H

#include "Student.h"

class DuplicateRollNoException{};
class InvalidMarksException{};
class DatabaseFullException{};
class InvalidRollNumberException {};


class StudentDatabase {
    Student students[50];
    int count;

public:
    StudentDatabase();
    void addStudent(Student s);
    void displayStudents();
    void searchStudent(int roll);
};

#endif
