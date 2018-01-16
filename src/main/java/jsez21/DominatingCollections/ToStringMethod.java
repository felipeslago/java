package jsez21.DominatingCollections;

import java.util.ArrayList;

public class ToStringMethod {

	public static void main(String[] args) {
		
		Person p1 = new Person("John", 21);
		Person p2 = new Person("Carl", 25);
		Person p3 = new Person("Bob", 30);
		
		ArrayList<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		
		// The default toString method of object class shows the full qualified name followed by the class short name
		// To list the class attributes is necessary to rewrite the toString method
		
		System.out.println(people);
	}
	
}
