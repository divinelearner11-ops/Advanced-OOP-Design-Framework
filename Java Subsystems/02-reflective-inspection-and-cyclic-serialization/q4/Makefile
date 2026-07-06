all: Node.class Main.class

Node.class: Node.java
	javac Node.java

Main.class: Main.java Node.class
	javac Main.java

run: all
	java Main

clean:
	rm -f *.class nodes.ser
