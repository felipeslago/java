package jse26.RegularExpressions;

public class Groupers {

	public static void main(String[] args) {
		
		// The Groupers objectives is to group characters that satisfy a pattern
		
		String text = "Java";
		boolean regex = false;
		
		regex = text.matches("[a-z]*"); // The grouper [a-z] specifies that the String must have only lower case letters from a to z
		System.out.println(regex);
		
		regex = text.matches("[A-Z]{1}[a-z]{3}"); // The grouper [A-Z]{1}[a-z]{3} specifies that the String must have at the first position one upper case letter from A to Z and 3 lower case letters from a to z
		System.out.println(regex);
		
		regex = text.matches("[a-zA-Z]*"); // The grouper [a-zA-Z] specifies that the String must have only letters from a to z
		System.out.println(regex);
		
		text = "123456789";
		
		regex = text.matches("[0-9]*"); // The grouper [0-9] specifies that the String must have only numbers from 0 to 9
		System.out.println(regex);
	}
	
}
