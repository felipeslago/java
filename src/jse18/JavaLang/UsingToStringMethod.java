package jse18.JavaLang;

public class UsingToStringMethod {

	public static void main(String[] args) {
		
		ToStringAndEqualsMethods tsaem = new ToStringAndEqualsMethods();
		tsaem.number = 10;
		
		System.out.println(tsaem.toString());
		
		System.out.println("The number is " + tsaem); // It also works because the JVM calls automatically the toString method in a concatenation
		
		ToStringAndEqualsMethods tsaem2 = new ToStringAndEqualsMethods();
		tsaem2.number = 10;
		
		System.out.println(tsaem.equals(tsaem2));
		
	}
	
}
