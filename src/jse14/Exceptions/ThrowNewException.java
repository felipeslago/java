package jse14.Exceptions;

public class ThrowNewException {

	public double balance;
	
	// Lets think there is a method for withdraw a certain amount from an account
	// But if the passed values is not valid? And if the account doesn't have this amount?
	// How to tell this to the class who called this method?
	// Maybe returning a boolean value (true if the operation was success or false if not)?
	// No, it is not the correct way
	// Doing this, how to separate different type of errors?
	// Returning a different integer for each situation?
	// Neither too
	// Simple, just throw an exception
	
	public void withdram(double value) {
		
		if(value == 0) {
			throw new IllegalArgumentException(); // This exception is an unchecked exception, so it doesn't obligate treatments
			
			// To obligate a treatment, this method must have a throw declaration
			// Like this: 'public void withdraw(double value) throws IOException {'
			
		} else if(this.balance < value) {
			
			// But just throwing a new exception do not tell the real reason of exception
			// The Exception objects has a constructor that takes a string argument
			// This argument is a custom message to the exception
			
			throw new IllegalArgumentException("There isn't enough balance to complete this operation.");
			
		}
	}
	
}
