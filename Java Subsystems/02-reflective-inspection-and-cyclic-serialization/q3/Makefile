all: Important.class Service.class AnnotationProcessor.class Main.class

Important.class: Important.java
	javac Important.java

Service.class: Service.java Important.class
	javac Service.java

AnnotationProcessor.class: AnnotationProcessor.java Important.class
	javac AnnotationProcessor.java

Main.class: Main.java Service.class AnnotationProcessor.class
	javac Main.java

run: all
	java Main

clean:
	rm -f *.class
