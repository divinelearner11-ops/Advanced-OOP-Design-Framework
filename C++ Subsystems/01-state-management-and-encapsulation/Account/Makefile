acc: main.o Account.o
	g++ main.o Account.o -o acc

main.o: main.cpp Account.h
	g++ -c main.cpp

Account.o: Account.cpp Account.h
	g++ -c Account.cpp

clean:
	rm -f *.o acc
