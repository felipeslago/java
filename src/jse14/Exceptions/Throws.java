package jse14.Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Throws {

	public static void main(String[] args) throws IOException { // The keyword throws tells to compiler to send forward the IOException
		
		// A simple, but not recommended, way to treat the exception is throwing it forward
		// It is dangerous to do this, because obligate another class to treat an exception generated in this class
		// In other words, this class have the logic, the rules, so who better tang this class to know what to do with an error?
		
		FileInputStream fis = new FileInputStream("file.txt");
		fis.close();
	}
	
}
