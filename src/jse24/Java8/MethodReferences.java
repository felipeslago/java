package jse24.Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MethodReferences {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Carl");
		names.add("John");
		names.add("Bob");
		
		// It is possible to simplify this line bellow by using method references
		
		names.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		// The Methods References allow to reference a constructor or method without creating or executing it
		// And the lambda is used to tell the comparison criteria
		
		names.sort(Comparator.comparing(s -> s.length()));
		
		// The method Comparator.comparing receives a functional interface
		// This code above can be broken like bellow
		
		Function<String, Integer> f = s -> s.length();
		Comparator<String> c = Comparator.comparing(f);
		names.sort(c);
		
		// There is a shorter way to write lambda
		
		names.sort(Comparator.comparing(String::length));
		
		// And it is possible to apply this to other methods
		
		names.forEach(s -> System.out.println(s)); // Instead this
		
		names.forEach(System.out::println); // Use this
	}
	
}
