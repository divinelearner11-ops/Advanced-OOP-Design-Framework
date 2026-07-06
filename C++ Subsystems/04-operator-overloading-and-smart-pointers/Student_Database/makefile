CXX = g++
CXXFLAGS = -Wall

all: program1

program1: Student.o StudentDatabase.o main.o
	$(CXX) Student.o StudentDatabase.o main.o -o program1

Student.o: Student.cpp Student.h
	$(CXX) $(CXXFLAGS) -c Student.cpp

StudentDatabase.o: StudentDatabase.cpp StudentDatabase.h Student.h
	$(CXX) $(CXXFLAGS) -c StudentDatabase.cpp

main.o: main.cpp StudentDatabase.h Student.h
	$(CXX) $(CXXFLAGS) -c main.cpp

run: program1
	./program1

clean:
	rm -f *.o program1
