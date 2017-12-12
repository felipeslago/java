package jsez26.RegularExpressions;

public class BoundaryMetacharacters {

	public static void main(String[] args) {
		
		// Boundary MetaCharacters are used to define if a String starts or ends with a pattern
		
		String text = "Java are awesome";
		boolean regex = false;
		
		regex = text.matches("^Java.*"); // The boundary matcher ^ specifies that the String must starts with 'Java'
		System.out.println(regex);
		
		regex = text.matches(".*some$"); // The boundary matcher $ specifies that the String must ends with 'some'
		System.out.println(regex);
		
		regex = text.matches("^DotNet.*|.*some$"); // The boundary matcher | specifies that the String must starts with 'DotNet' OR ends with 'some'
		System.out.println(regex);
		
	}
	
}
