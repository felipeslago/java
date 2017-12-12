package jsez23.WildcardAndRawType;

import java.util.ArrayList;
import java.util.List;

public class UnknownWildcard {

	// It is possible to interact with a object unknowing its type
	// The ? (Unknown WildCard Operator) helps doing this
	
	public static void print(List<?> list) {
		
		// This method receives an unknown list type, but can interact with its elements because it will always be an object
		// It is not possible to add new items to the list, because it is unknown
		
		for(Object item :  list) {
			System.out.println(item);
		}
		
	}
	
	public static void main(String[] args) {
		
		// Creating two type of lists
		
		List<String> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		
		l1.add("A");
		l1.add("B");
		l1.add("C");
		
		l2.add(1);
		l2.add(2);
		l2.add(3);
		
		// Calling the same method
		
		UnknownWildcard.print(l1);
		UnknownWildcard.print(l2);
		
	}
	
}
