package jse19.JavaIO;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerPrintStream {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		
		// The Java 5 brings a new class java.util.Scanner thats make easier to read a InputStream object
		// Also the PrintStream class has a constructor that receives a file name
		
		Scanner s = new Scanner(System.in);
		PrintStream ps = new PrintStream("file.txt");
		
		while(s.hasNextLine()) {
			ps.println(s.nextLine());
		}
		
		// So it became easier to read the data from keyboard and write it in a file
		
	}
	
}
