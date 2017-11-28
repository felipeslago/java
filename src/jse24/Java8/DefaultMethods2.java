package jse24.Java8;

public class DefaultMethods2 implements IWelcome, IHello {

	// If two or more Interfaces has the same methods, just rewrite the method the will be used
	// It is possible to call a specific method using the keyword super and specifying the Interface
	
	@Override
	public void sayHello() {
		System.out.println("Hello");
	}
	
	public void HelloWorld() {
		// Do something
		// Or
		IWelcome.super.HelloWorld();
	}
	
	public static void main(String[] args) {
		
		DefaultMethods2 dm = new DefaultMethods2();
		dm.sayHello();
		dm.HelloWorld();
		
	}
}
