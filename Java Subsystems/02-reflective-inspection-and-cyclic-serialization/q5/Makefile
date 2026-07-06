all: Product.class ProductAlreadyExistsException.class ProductNotFoundException.class InventoryLoadException.class Inventory.class ContainerInspector.class Main.class

Product.class: Product.java
	javac Product.java

ProductAlreadyExistsException.class: ProductAlreadyExistsException.java
	javac ProductAlreadyExistsException.java

ProductNotFoundException.class: ProductNotFoundException.java
	javac ProductNotFoundException.java

InventoryLoadException.class: InventoryLoadException.java
	javac InventoryLoadException.java

Inventory.class: Inventory.java Product.class ProductAlreadyExistsException.class ProductNotFoundException.class
	javac Inventory.java

ContainerInspector.class: ContainerInspector.java
	javac ContainerInspector.java

Main.class: Main.java Inventory.class ContainerInspector.class InventoryLoadException.class
	javac Main.java

run: all
	java Main

clean:
	rm -f *.class inventory.ser
