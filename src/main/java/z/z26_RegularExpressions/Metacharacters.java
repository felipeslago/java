package z.z26_RegularExpressions;

public class Metacharacters {

    // Regular Expression, or RegEx, is a formatted string that indicates a pattern
    // Its principal objective is to validate data from a program by searching for this pattern

    // To create Regular Expression is necessary to use some special characters, known as MetaCharacters
    // Here are some characters used to construct RegEx
    // It is possible to use Character or MetaCharacter to construct a regular expression

    /*
     * Character: MetaCharacter: ================================================== =============== "." any character *
     * "\d" any number [0-9] "\D" any character that is not a number [^0-9] "\w" any letter or number [a-zA-Z_0-9] "\W"
     * any character that is not a letter or a number [^\w] "\s" any spaces or tabs [\t\n\x0B\f\r] "\S" any character
     * that doesn't have spaces or tabs [^\s]
     */

    public static void main(String[] args) {

        String phone = "555 555-5555";
        boolean regex = false;

        // The pattern that represents the phone number above is '\d{3} \d{3}-\d{4}' (using Characters)
        // So the phone number is composed by 3 numbers, one space, more 3 numbers, one trace and more 4 numbers
        // Using MetaCharacters the pattern will be '[0-9]{3} [0-9]{3}-[0-9]{4}'
        // Character and MetaCharacter patterns works perfectly equal

        // To help in searching for a pattern, Java provides the method matches
        // The method matches returns a boolean evaluating if a RegEx is true or false

        regex = phone.matches("\\d{3} \\d{3}-\\d{4}"); // It is important to use two \\ that represents a escape
                                                       // character
        System.out.println(regex);

        regex = phone.matches("[0-9]{3} [0-9]{3}-[0-9]{4}");
        System.out.println(regex);

        regex = phone.matches(".{12}"); // 12 any characters in the String
        System.out.println(regex);

        String text = "Java";

        regex = text.matches("\\D{4}"); // 4 any characters that are not a number
        System.out.println(regex);

        text = "@Java";

        regex = text.matches("\\w{5}"); // 5 any characters that are numbers or letters
        System.out.println(regex); // But it will returns false because the String have an @

        text = "@#$";

        regex = text.matches("\\W{3}"); // 3 any special characters
        System.out.println(regex);

        text = "   ";

        regex = text.matches("\\s{3}"); // 3 spaces
        System.out.println(regex);

        text = "J A V A";

        regex = text.matches("\\S{7}"); // 7 any characters that doesn't have spaces
        System.out.println(regex); // But it will returns false because the String have spaces
    }
}
