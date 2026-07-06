#include "StudentReportGenerator.h"
#include "ReportExceptions.h"

double StudentReportGenerator::calculatePercentage(Student s){

    int total = 0;

    for(int i=0;i<5;i++){

        if(s.marks[i] < 0)
            throw MissingSubjectException();

        total += s.marks[i];
    }

    if(5 == 0)
        throw DivisionException();

    return total/5.0;
}

char StudentReportGenerator::assignGrade(double p){

    if(p >= 90)
        return 'A';

    else if(p >= 75)
        return 'B';

    else if(p >= 60)
        return 'C';

    else if(p >= 50)
        return 'D';

    else
        return 'F';
}

void StudentReportGenerator::generateReport(Student s){

    try{

        double percentage = calculatePercentage(s);

        char grade = assignGrade(percentage);

        cout<<"\nReport for "<<s.name<<endl;
        cout<<"Percentage: "<<percentage<<endl;
        cout<<"Grade: "<<grade<<endl;
    }

    catch(ReportException &e){
        throw;
    }
}

void StudentReportGenerator::generateBulkReports(Student students[], int n){

    for(int i=0;i<n;i++){

        try{

            generateReport(students[i]);
        }

        catch(ReportException &e){

            cout<<"Error generating report for student "
                <<students[i].rollNo<<endl;
        }
    }
}