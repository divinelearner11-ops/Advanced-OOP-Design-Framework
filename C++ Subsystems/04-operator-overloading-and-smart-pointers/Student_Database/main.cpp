#include "StudentDatabase.h"

int main() {

    StudentDatabase db;
    int choice;

    while(true){

        cout << "\n1. Add Student\n";
        cout << "2. Display Students\n";
        cout << "3. Search Student\n";
        cout << "4. Exit\n";

        cin >> choice;

        try{

            if(choice == 1){

                Student s;
                s.input();

                db.addStudent(s);
                cout << "Student added successfully\n";
            }

            else if(choice == 2)
                db.displayStudents();

            else if(choice == 3){

                int roll;
                cout << "Enter roll number: ";
                cin >> roll;

                db.searchStudent(roll);
            }

            else if(choice == 4)
                break;
                
            else cout<<"Invalid Choice \n";

        }

        catch(DuplicateRollNoException){
            cout << "Error: Duplicate Roll Number\n";
        }

        catch(InvalidMarksException){
            cout << "Error: Marks must be between 0 and 100\n";
        }

        catch(DatabaseFullException){
            cout << "Error: Database Full\n";
        }

        catch(InvalidRollNumberException){
            cout << "Error: Roll number must be positive\n";
        }

    }

    return 0;
}
