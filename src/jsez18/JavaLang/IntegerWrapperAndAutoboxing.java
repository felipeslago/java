package jsez18.JavaLang;

public class IntegerWrapperAndAutoboxing {

	public static void main(String[] args) {
		
		// The simple way to convert an integer into a string is concatenate it with string
		
		int number = 10;
		String text = "" + number;
		
		System.out.println(text);
		
		// To convert a string in an integer use the parseInt method from the wrapper Integer class
		
		number = Integer.parseInt(text);
		
		System.out.println(number);
		
		// A primitive type is not an object (int, double, short, long, float, boolean and etc.)
		// This wrapper classes are used to treat the primitive types like objects and then get the value again
		Object[] objects = new Object[10];
		Integer objectInt = new Integer(number);
		
		objects[1] = objectInt;
		
		number = objectInt.intValue();
		
		// From Java 5.0 to now this processes are executed automatically, it is called Autoboxing
		
		number = objectInt;
		
	}
	
}
