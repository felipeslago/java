package jsez24.Java8;

public class DefaultMethods1 implements IWelcome {

	// Java 8 brings a new feature to the Interface classes
	// Now it is possible to use an unimplemented method from the Interface
	// Not that the "HelloWorld" method is not implemented in this class
	// Look at the IWelcome interface to learn more
	
	@Override
	public void sayHello() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		DefaultMethods1 dm = new DefaultMethods1();
		dm.sayHello();
		dm.HelloWorld();
		
	}
}
