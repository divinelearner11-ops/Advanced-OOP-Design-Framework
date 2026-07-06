bike: main.o Bike.o
	g++ main.o Bike.o -o bike

main.o: main.cpp Bike.h
	g++ -c main.cpp

Bike.o: Bike.cpp Bike.h
	g++ -c Bike.cpp

clean:
	rm -f *.o bike
