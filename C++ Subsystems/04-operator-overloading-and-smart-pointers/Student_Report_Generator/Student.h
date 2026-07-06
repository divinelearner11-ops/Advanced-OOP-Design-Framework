#ifndef STUDENT_H
#define STUDENT_H

#include <iostream>
#include <string>

using namespace std;

class Student {

public:

    int rollNo;
    string name;
    int marks[5];

    void input() {

        cout<<"Enter Roll Number: ";
        cin>>rollNo;

        cout<<"Enter Name: ";
        cin>>name;

        cout<<"Enter marks of 5 subjects\n";

        for(int i=0;i<5;i++)
            cin>>marks[i];
    }

    void display() {

        cout<<"Roll No: "<<rollNo<<endl;
        cout<<"Name: "<<name<<endl;

        cout<<"Marks: ";

        for(int i=0;i<5;i++)
            cout<<marks[i]<<" ";

        cout<<endl;
    }
};

#endif