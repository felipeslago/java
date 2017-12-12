package jsez20.CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorClass {

	public static void main(String[] args) {
		
		// The iterator is used to go through a collection
		// It knows what is inside the collections and gives access to it elements
		// The enhanced-for uses iterator under its code, so uses the enhanced-for as much as it is possible
		
		Set<String> people = new HashSet<>();
		
		people.add("John");
		people.add("Carl");
		people.add("Lily");
		
		Iterator<String> iterator = people.iterator();
		
		while (iterator.hasNext()) { // The hasNext method returns a boolean indicating if the list has more elements
			String person = iterator.next(); // The next method returns the current element
			System.out.println(person);
		}
	}
	
}
