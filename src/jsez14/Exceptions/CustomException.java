package jsez14.Exceptions;

@SuppressWarnings("serial")
public class CustomException extends Exception {

	// It is possible to create custom exceptions
	// Just extend the class to the Exception class (Exception, IOException, FileNotFoundException)
	
	public CustomException() {
		super();
	}
	
	public CustomException(String message) {
		super(message); // It is calling the constructor from the superclass
	}
	
}
