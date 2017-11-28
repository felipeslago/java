package jse18.JavaLang;

import java.io.PrintStream;

import jse11.interfaces.Manager;

public class ObjectClass {

	// Every time a class is created, it must inherit from another
	// In other words, every created class has a superclass
	// But this class doesn't have the extends keyword
	// When the JVM not found the extends keyword, it considers that the class extends from Object
	// All classes, without exception, extends from Object
	
	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		Manager m = new Manager("John", 200.0);
		char[] c = {'A', 'B', 'C', 'D', 'E'};
		StringBuilder sb = new StringBuilder();
		PrintStream sr = System.out;
		
		Object[] objs = new Object[5];
		objs[0] = i;
		objs[1] = m;
		objs[2] = c;
		objs[3] = sb;
		objs[4] = sr;
		
	}
	
}
