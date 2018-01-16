package jsez21.DominatingCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList {

	public static void main(String[] args) {
		
		// The HashSet class do not permits duplicated values and do not keeps the insertion order
		
		Set<String> names1 = new HashSet<>();
		
		names1.add("Carl One");
		names1.add("John Two");
		names1.add("Bob Three");
		names1.add("Lily Four");
		names1.add("Carl One");
		
		System.out.println(names1);
		
		// But there is a simple way to sort its elements if is needed
		// By using the polymorphism it is possible to use the benefits of all Collection children
		
		Collection<String> names2 = new HashSet<>();
		
		names2.add("Carl One");
		names2.add("John Two");
		names2.add("Bob Three");
		names2.add("Lily Four");
		names2.add("Carl One");
		
		// As Set and List are children of Collection it is possible to transfer its structure to each other
		
		List<String> sortedNames = new ArrayList<>(names2);
		Collections.sort(sortedNames);
		
		System.out.println(sortedNames);
	}
	
}
