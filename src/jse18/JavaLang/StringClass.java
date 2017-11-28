package jse18.JavaLang;

public class StringClass {

	public static void main(String[] args) {
		
		// String variables keeps a reference to an object and not its value
		
		String a = new String("a");
		String b = new String("b");
		
		// These are to different objects
		
		System.out.println(a == b); // The == operator will compare the objects reference and not its values
		System.out.println(a.equals(b)); // The equals method was rewritten by the creator of String class and compares its values
		
		// It is possible to concatenate a string with any object
		
		String number = "Number " + 10;
		System.out.println(number);
		
		// The split method separates a string by character
		
		String phrase = "Java is awesome";
		String[] words = phrase.split(" ");
		
		for(String word : words) {
			System.out.print(word + " ");
		}
		
		// The compareTo method indicates if two strings are equals, returning 0, or if it is less than, returning a negative integer, or higher than, returning a positive integer
		
		System.out.println(a.compareTo(b));
		
		// The toUpperCase and toLowerCase methods transforms the string into upper or lower case
		
		a.toUpperCase(); // But doing this will not change the string value
		System.out.println(a);
		
		a = a.toUpperCase(); // The value must be assigned again
		
		System.out.println(a);
		
		a = a.toLowerCase();
		
		// It goes for all, because the string methods returns a new string, but nor change the actual value
		
		// The replace method replaces a value by other
		
		a = a.replace("a", "b");
		
		System.out.println(a);
		
		// And it is possible to concatenate methods
		
		a = a.toUpperCase().replace("B", "A");
		
		System.out.println(a);
		
		// The charAt method returns the character at the specified position
		
		System.out.println(phrase.charAt(6));
		
		// The length method returns the string length
		
		System.out.println(phrase.length());
		
		// The substring method returns a new string by the passed position
		
		System.out.println(phrase.substring(3));
		
		// The indexOf method returns the position of the first found specified char or string
		
		System.out.println(phrase.indexOf("a"));
		
		// The lastIndexOf method returns the position of the last found specified char or string
		
		System.out.println(phrase.lastIndexOf("a"));
		
		// The isEmpty method returns a boolean indicating is a string is empty or not
		
		System.out.println(phrase.isEmpty());
		
		// The contains method returns a boolean indicating if a string contains another
		
		System.out.println(phrase.contains("is"));
		
	}
	
}
