course: main.o Course.o
	g++ main.o Course.o -o course

main.o: main.cpp Course.h
	g++ -c main.cpp

Course.o: Course.cpp Course.h
	g++ -c Course.cpp

clean:
	rm -f *.o course
