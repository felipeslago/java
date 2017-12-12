package jsez19.JavaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadDataFromKeyboard {

	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in; // To read data from keyboard just change the input method
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter some data: ");
		String s = br.readLine();
		
		while(!s.isEmpty()) {
			System.out.println("Inputted data: " + s);
			System.out.println("Enter more data: ");
			s = br.readLine();
		}
		
		// Here is a good example of polymorphism
		// No matter what kind of input is passed, the entire code will compile
		
		// It is very common that the methods receives and returns InputStream objects instead an specific child
		// By doing this, the methods uncouplea the information and hides the implementation and the code changes will be easier
		
	}
	
}
