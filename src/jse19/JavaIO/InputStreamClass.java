package jse19.JavaIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamClass {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws IOException {
		
		// The InputStream class is an abstract class and the FileInputStream class is its concrete child
		// The FileInputStream class is used to read files, but it only reads byte by byte
		
		InputStream is = new FileInputStream("file.txt"); // The FileInputStream constructor requires a parameter specifying the file location
		
		// The relative path is where the JVM is executed, but it is possible to use the absolute path of a file instead it
		
		int b = is.read();
		
		// But to read a character is necessary to translate the byte using the respective encoding
		// The InputStreamReader class do this
		
		InputStreamReader isr = new InputStreamReader(is); // The InputStreamReader constructor requires a parameter specifying a InputStream object
		
		b = isr.read();
		
		// Using the InputStreamReader class is complicated to read a String
		// So the BufferedReader receives another reader by its constructor and concatenate many chars to form a String by the method readLine
		
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		
		// This class reads the reader by pieces, using a buffer, to avoid many calls to the operating system
		// It is possible to configure the buffer size by the class constructor
		
		// This pattern used above is called Decorator Pattern
		// In short: InputStream (byte) -> InputStreamReader (char) -> BufferedReader (String)
		
		// The readLine method reads one line by turn
		// After reading a line, it moves the cursor to the next line
		// When it gets to the end of the reader, it returns null
		
		while(s != null) { // Runs through the reader
			System.out.println(s);
			s = br.readLine(); // Reads the next line
		}
	}
	
}
