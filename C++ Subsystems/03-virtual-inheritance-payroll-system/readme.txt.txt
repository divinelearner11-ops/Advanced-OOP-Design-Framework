INTRODUCTION TO OBJECT ORIENTED PROGRAMMING USING C++
ASSIGNMENT – 3
BATCH 3 – EMPLOYEE PAYMENT SYSTEM

Student Name: Ankit Kumar Ahirwar
Enrollment Number: BT24CSE065


			   To run this program, use make command in terminal then ./pay to see output
PROGRAM OVERVIEW
This program implements an Employee Payment System using multiple inheritance and runtime polymorphism in C++.


Classes implemented:

Employee (Base Class)
Manager
Developer
TeamLead

Manager and Developer inherit virtually from Employee to resolve the diamond problem. TeamLead inherits from both Manager and Developer.

SALARY LOGIC

Employee:
Bonus = 5% of base salary
Salary = base + bonus

Manager:
Bonus = 10% of base salary + $100 per team member
Salary = base + bonus + $5000 management allowance

Developer:
Bonus = $500 per completed project
Salary = base + bonus

TeamLead:
Bonus = maximum of Manager and Developer bonus
Salary = base + bonus + $5000 + $3000
Base salary counted only once


CONCEPTS USED
Function Overriding
Runtime Polymorphism (using base class pointers)
Virtual Destructor
Virtual Inheritance (Diamond Problem Resolution)
Separate Compilation
Makefile for compilation


FILES INCLUDED
Employee.h
Employee.cpp
main.cpp
makefile
readme.txt

The program calculates salary for different employee types and prints the total company payroll using polymorphism.

All assignment instructions have been followed.