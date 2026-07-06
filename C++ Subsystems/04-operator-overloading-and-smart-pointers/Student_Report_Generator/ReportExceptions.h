#ifndef REPORTEXCEPTIONS_H
#define REPORTEXCEPTIONS_H

#include <exception>

class ReportException : public std::exception {};

class IncompleteDataException : public ReportException {};

class MissingSubjectException : public ReportException {};

class CalculationException : public ReportException {};

class DivisionException : public ReportException {};

#endif