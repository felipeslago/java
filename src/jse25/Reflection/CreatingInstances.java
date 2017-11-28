package jse25.Reflection;

import java.lang.reflect.Constructor;

public class CreatingInstances {

	// With an object is is possible to instantiate it and even use its constructor
	
	// This function receives the object and its parameters for the constructor
	
	public static Object getInstance(Object obj, Object... params) throws Exception {
		
		Class<?> c = obj.getClass(); // Gets the class
		Class<?>[] types = new Class<?>[params.length]; // Creates an array of parameters types
		
		for (int i = 0; i < params.length; i++) {
			types[i] = params[i].getClass(); // Sets the type passed
		}
		
		Constructor<?> constructor = c.getConstructor(types); // Gets the object constructor based on the parameters
		return constructor.newInstance(params);
		
	}
	
	public static void main(String[] args) throws Exception {
		
		Person person = new Person();
		
		person = (Person) CreatingInstances.getInstance(person, "John", "Fox", 20, "Main Street", "ABC321");
		
		System.out.println(person);
		
	}
	
}
