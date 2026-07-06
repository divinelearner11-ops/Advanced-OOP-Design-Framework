stud: main.o Student.o
	g++ main.o Student.o -o stud

main.o: main.cpp Student.h
	g++ -c main.cpp

Student.o: Student.cpp Student.h
	g++ -c Student.cpp

clean:
	rm -f *.o stud
