all: Student.class Main.class

Student.class: Student.java
	javac Student.java

Main.class: Main.java Student.class
	javac Main.java

run: all
	java Main

clean:
	rm -f *.class student.ser
