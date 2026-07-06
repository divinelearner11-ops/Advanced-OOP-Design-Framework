#ifndef STUDENTREPORTGENERATOR_H
#define STUDENTREPORTGENERATOR_H

#include "Student.h"

class StudentReportGenerator {

public:

    double calculatePercentage(Student s);

    char assignGrade(double percentage);

    void generateReport(Student s);

    void generateBulkReports(Student students[], int n);
};

#endif