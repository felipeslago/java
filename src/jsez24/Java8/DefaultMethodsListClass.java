package jsez24.Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsListClass {

	public static void main(String[] args) {
		
		// The List class brings some new Default Methods in it
		
		List<String> names = new ArrayList<>();
		
		names.add("Carl");
		names.add("John");
		names.add("Bob");
		
		System.out.println(names);
		
		// The sort method can be invoked like this
		names.sort(null);
		
		// Or creating a new Comparator
		
		names.sort(new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.length() < s2.length()) {
					return -1;
				} else if(s1.length() > s2.length()) {
					return 1;
				}
				return 0;
			}
		});
		
		System.out.println(names);
		
		// The forEach iteration can be invoked like this, creating a new Consumer
		
		names.forEach(new Consumer<String>() {
			public void accept(String s) {
				System.out.println(s);
			}
		});
	}
	
}
