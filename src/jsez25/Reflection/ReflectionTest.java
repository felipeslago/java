package jsez25.Reflection;

public class ReflectionTest {

	public static void main(String[] args) {
		
		// Take a look at the Register class to check the Reflection
		
		Person person = new Person();
		Register register = new Register();
		
		register.registerPerson(person);
		
		register.checkNull(person);
		
	}
	
}
