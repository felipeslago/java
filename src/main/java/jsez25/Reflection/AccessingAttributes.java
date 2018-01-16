package jsez25.Reflection;

import java.lang.reflect.Field;

public class AccessingAttributes {

	// There are some peculiarities while accessing attributes that are shown below
	
	public static void listObjectAttributes(Object obj) throws Exception {
		
		Class<?> c = obj.getClass(); // Gets the class
		Field[] fields = c.getFields(); // Gets only the PUBLIC attributes
		
		System.out.println("Public attributes: ");
		System.out.println();
		
		for (Field field : fields) {
			System.out.println(field.getType() + " - " + field.getName() + " - " + field.get(obj)); // Gets the attribute type, name and value
		}
		
		fields = c.getDeclaredFields(); // Gets PUBLIC and PRIVATE attributes, but not gets the attributes from the superclass
		
		System.out.println();
		System.out.println("Public and Private attributes: ");
		System.out.println();
		
		for (Field field : fields) {
			
			// If some attribute is PRIVATE is not possible to access it before making it enabled
			// It is possible to turn some attributes into public, but only in reflection code
			// But depending on what it is running, the SecurityManager can block it
			
			if(!field.isAccessible()) { // Check if the attribute is private
				field.setAccessible(true); // Turn attribute to public
			}
			
			System.out.println(field.getType() + " - " + field.getName() + " - " + field.get(obj));
		}
		
		System.out.println();
		System.out.println("Changing attributes values: ");
		System.out.println();
		
		for (Field field : fields) {
			if(!field.isAccessible()) {
				field.setAccessible(true);
			}
			
			// It is possible to change the attribute value, but be careful while assign a new value to an attribute
			// If the attribute is an Integer, assigning a String value will throw an exception
			
			if(field.getType() == String.class) { // Check the type of the attribute
				field.set(obj, "changed"); // Changes it value
			} else if(field.getType() == int.class) {
				field.set(obj, 0);
			}
			
			System.out.println(field.getType() + " - " + field.getName() + " - " + field.get(obj));
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		Person person = new Person("John", "Fox", 20, "Main Street", "ABC321");
		
		AccessingAttributes.listObjectAttributes(person);
		
	}
	
}
