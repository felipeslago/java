package jsez20.CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {

	public static void main(String[] args) {
		
		List<String> people1 = new ArrayList<>();
		
		people1.add("John");
		people1.add("Carl");
		people1.add("Lily");
		
		System.out.println(people1);
		
		// The Collections class has a method that sorts a list in ascending order
		
		Collections.sort(people1);
		
		System.out.println(people1);
		
		// And what if sort a list of objects?
		// Is necessary to tell the JVM how to compare the object by implementing the Comparable interface in the object
		
		Person p1 = new Person("John", 30);
		Person p2 = new Person("Carl", 20);
		Person p3 = new Person("Lily", 25);
		List<Person> people2 = new ArrayList<>();
		
		people2.add(p1);
		people2.add(p2);
		people2.add(p3);
		
		System.out.println(people2);
		
		Collections.sort(people2);
		
		System.out.println(people2);
		
		// And how about compare the object by person age?
		// Just rewrite the compareTo method to compare age instead name in Person class
		
		// The binarySearch method returns the position of an object in a list or a negative number if it was not found
		
		System.out.println(Collections.binarySearch(people2, p3));
		
		// The max method returns the maximum value of an element in a list
		
		System.out.println(Collections.max(people2));
		
		// The min method returns the minimum value of an element in a list
		
		System.out.println(Collections.min(people2));
		
		// The reverse method reverses a list
		
		Collections.reverse(people2);
		
		System.out.println();
	}
	
}
