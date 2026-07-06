CXX = g++
CXXFLAGS = -Wall -std=c++17

all: program

program: main.o Employee.o
	$(CXX) $(CXXFLAGS) main.o Employee.o -o pay

main.o: main.cpp Employee.h
	$(CXX) $(CXXFLAGS) -c main.cpp

Employee.o: Employee.cpp Employee.h
	$(CXX) $(CXXFLAGS) -c Employee.cpp

clean:
	rm -f *.o pay
