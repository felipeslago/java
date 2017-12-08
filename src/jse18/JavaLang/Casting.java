/*package jse18.JavaLang;

import java.io.PrintStream;

import jse11.interfaces.Manager;

public class Casting {

	// The ability to refer an object like an Object class has many advantages
	
	public static void main(String[] args) {
		
		Object[] arrayOfObjects = new Object[10]; // It is possible to create an array of objects
		
		Manager manager = new Manager("John", 100.0);
		PrintStream out = System.out;
		
		arrayOfObjects[0] = manager;
		arrayOfObjects[1] = out; // And insert any kind of object inside it
		
		manager = (Manager) arrayOfObjects[0]; // It is possible to use the object methods and attributes by casting it
		
	}
	
}*/
