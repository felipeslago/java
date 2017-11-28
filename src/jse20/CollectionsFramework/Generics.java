package jse20.CollectionsFramework;

import java.util.List;
import java.util.ArrayList;

public class Generics {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// When using lists, it is possible to add any type of objects
		// But is not easy to uses its methods and properties after getting it
		// A casting is needed before done this
		
		Person p1 = new Person("John", 21);
		List people1 = new ArrayList();
		
		people1.add(p1);
		p1 = (Person) people1.get(0);
		System.out.println(p1.getInformation());
		
		// The Generics resource helps this work to resticting the list to one kind of object
		// Besides more trustful for the JVM and eliminates the use of casting
		
		List<Person> people2 = new ArrayList<>(); // The <> command tells to the JVM that the Generics will be used
		
		people2.add(p1);
		System.out.println(people2.get(0).getInformation()); // Using the object from the list without casting it
	}
	
}
