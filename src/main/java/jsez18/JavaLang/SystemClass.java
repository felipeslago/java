package jsez18.JavaLang;

import java.io.IOException;
import java.io.PrintStream;

public class SystemClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		
		System.out.println("something");
		
		// During the examples the System.out.println method was used many times without import any package
		// It happens because this class is inside the java.lang package that is automatically imported
		// Only this package has this feature
		
		PrintStream out = System.out; // The out attribute, from the System class, is a PrintStream type
		out.println("Hello World");
		
		int i = System.in.read(); // This method reads just bytes
		
		System.exit(0); // This method turns off the Virtual Machine
		
	}
	
}
