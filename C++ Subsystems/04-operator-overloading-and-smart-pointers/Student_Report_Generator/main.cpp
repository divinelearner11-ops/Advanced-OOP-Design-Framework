#include "StudentReportGenerator.h"
#include "ReportExceptions.h"

int main(){

    int n;

    cout<<"Enter number of students: ";
    cin>>n;

    Student students[50];

    for(int i=0;i<n;i++){

        cout<<"\nEnter details for student "<<i+1<<endl;
        students[i].input();
    }

    StudentReportGenerator generator;

    try{

        generator.generateBulkReports(students,n);
    }

    catch(ReportException &e){

        cout<<"Error while generating reports\n";
    }

    return 0;
}