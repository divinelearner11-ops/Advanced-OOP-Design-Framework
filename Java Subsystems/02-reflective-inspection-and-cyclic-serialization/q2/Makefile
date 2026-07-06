all: Address.class DeepCopyUtil.class Main.class

Address.class: Address.java
	javac Address.java

DeepCopyUtil.class: DeepCopyUtil.java
	javac DeepCopyUtil.java

Main.class: Main.java Address.class DeepCopyUtil.class
	javac Main.java

run: all
	java Main

clean:
	rm -f *.class
