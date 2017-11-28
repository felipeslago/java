package jse19.JavaIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcez {

	public static void main(String[] args) {
		
		// The Java 7 brings a new structure try-with-resources that automatically invokes the close method
		// To use this resource the classes must implement the java.lang.AutoCloseable interface like the readers, writers and streams classes
		
		try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
			
			// The close method will be automatically called at the end of this block
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
