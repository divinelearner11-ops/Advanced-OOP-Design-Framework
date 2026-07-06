Question 1: Multilevel Inheritance – Academic Hierarchy

This program demonstrates multilevel inheritance in C++.

Class Hierarchy:
Human → Teacher → Professor

Human:
- Stores name and age

Teacher:
- Inherits Human
- Adds subject information

Professor:
- Inherits Teacher
- Adds designation
- Displays complete details

Key Concepts Demonstrated:
- Multilevel inheritance
- Constructor chaining
- Protected data member access
- Separate compilation

Constructor Invocation Order:
Human → Teacher → Professor
