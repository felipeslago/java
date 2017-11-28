package jse25.Reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Register {

	List<Person> registered = new ArrayList<>();
	
	// How to check if a property is null before adding a new object to a list?
	// Make a chained if is not the best way
	// And if the object class change? This chained if must be changed
	
	public void registerPerson(Person person) {
		
		if(person.firstName == null) {
			System.out.println("First Name cannot be null.");
		}
		if(person.lastName == null) {
			System.out.println("Last Name cannot be null.");
		}
		if(person.age == 0) {
			System.out.println("Age cannot be null.");
		}
		if(person.address == null) {
			System.out.println("Address cannot be null.");
		}
		if(person.passport == null) {
			System.out.println("Passport cannot be null.");
		}
		
	}
	
	// Reflection is the best way to avoid this situation and to make the code cleaner and easier
	// With reflection is possible to create algorithms that can obtain and manipulate elements in its own code
	
	public void checkNull(Object obj) {
		try {
			Class<?> c = obj.getClass(); // Gets the class
			Field[] fields = c.getFields(); // Gets the PUBLIC fields
			
			for (Field field : fields) {
				Object value = field.get(obj); // Gets the field value
				
				if(value == null) { // Check if is null
					System.out.println("The property " + field.getName() + " cannot be null");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
