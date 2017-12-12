package jsez18.JavaLang;

import static java.lang.Math.*;

public class MathClass {

	public static void main(String[] args) {
		
		// The Math class has many static methods to make numerical operations
		
		// The round method rounds a floating point number
		
		double x = 5.5;
		long y = Math.round(x);
		
		System.out.println(y);
		
		// The abs method returns the absolute number
		
		int z = -4;
		z = Math.abs(z);
		
		System.out.println(z);
		
		// The sqrt method returns the root of a number
		
		double d = sqrt(z); // Using the import static declaration avoid the uses of the class name before the method
		
		System.out.println(d);
		
		// The sin method returns the sine of a number
		
		double sin = Math.sin(d);
		
		System.out.println(sin);
	}
	
}
