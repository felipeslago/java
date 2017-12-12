package jsez18.JavaLang;

public class ToStringAndEqualsMethods {

	// Every object has some default methods and it is possible to rewrite these
	
	int number;
	
	// The default of this method is return the class name and a unique id
	
	public String toString() {
		return "" + this.number;
	}
	
	// The default of this method is compare a reference of an object like the == operator
	// The contract defined the Object class specifies that the Equals method must return false if the passed object is not the same as the class
	
	public boolean equals(Object object) {
		
		if(!(object instanceof ToStringAndEqualsMethods)) { // The instance of operator indicates if the passed object is the same as the class
			return false;
			
			// This comparison is needed to avoid Exceptions if the passed object is not the same as this class
		}
		
		ToStringAndEqualsMethods tsaem = (ToStringAndEqualsMethods) object;
		
		return this.number == tsaem.number;
	}

}
