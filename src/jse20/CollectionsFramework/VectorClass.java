package jse20.CollectionsFramework;

import java.util.Vector;

public class VectorClass {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// Vector is similar to and ArrayList, actually it has the same methods
		// The big difference is performance
		// Different from ArrayList, ArrayList increase 50% of its size when reach the list capacity, the Vector double its size
		// If the need is to increase very often the list size, is recommended to use the Vector class
		// This class is thread-safe too
		
		Vector v = new Vector();
		
		v.add("some text");
		v.add("another text");
		
		System.out.println(v);
	}
	
}
