package jsez21.DominatingCollections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListXLinkedList {

	public static void main(String[] args) {
		
		// The basic difference between ArrayList and LinkedList is performance
		// ArrayList works with an internal array to keep the elements
		// Meanwhile LinkedList uses a double linked list, that has nodes and each node has two fields specifying the previous and the next element
		
		// ArrayList works better for getting an specified object, but inserting a new object in the top of the list will be slow
		// The array gas to rearrange all objects to the next position
		
		// LinkedList is faster inserting new objects in the top of the list, but is slower when searching for an object
		// It has to pass through all nodes until find the object
		
		ArrayList<String> al = new ArrayList<>();
		LinkedList<String> ll = new LinkedList<>();
		long start = 0;
		long end = 0;
		
		start = System.currentTimeMillis();
		
		for(int i = 0; i < 100000;  i++) {
			al.add(0, Integer.toString(i));
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("ArrayList inserting in the top: " + (end - start) + " milliseconds");
		
		start = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++) {
			ll.addFirst(Integer.toString(i));
		}
		
		end = System.currentTimeMillis();
		
		System.out.println();
		System.out.println("LinkedList inserting in the top: " + (end - start) + " milliseconds");
		
		start = System.currentTimeMillis();
		
		for(int i = 0; i < 100000;  i++) {
			al.get(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.println();
		System.out.println("ArrayList getting specific element: " + (end - start) + " milliseconds");
		
		start = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++) {
			ll.get(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.println();
		System.out.println("LinkedList getting specific element: " + (end - start) + " milliseconds");
		
		
	}
	
}
