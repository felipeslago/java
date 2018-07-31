package z.z26_RegularExpressions;

public class Quantifiers {

    public static void main(String[] args) {

        // A MetaCharacter needs a quantifier to specify how many times it needs to repeat a character
        // The quantifier is specified after the MetaCharacter

        String text = "ABCDE";
        boolean regex = false;

        regex = text.matches("\\w{5}"); // The quantifier {5} specifies that the String must have 5 any MetaCharacters
        System.out.println(regex);

        regex = text.matches("\\w{2,}"); // The quantifier {2,} specifies that the String must have at least 2 any
                                         // MetaCharacters
        System.out.println(regex);

        regex = text.matches("\\w{2,5}"); // The quantifier {2,5} specifies that the String must have at least 2 any
                                          // MetaCharacters and maximum of 5 MetaCharacters
        System.out.println(regex);

        regex = text.matches("\\w?"); // The quantifier ? specifies that the String must have 0 or 1 MetaCharacter
        System.out.println(regex);

        regex = text.matches("\\w*"); // The quantifier * specifies that the String must have 0 or more MetaCharacter
        System.out.println(regex);

        regex = text.matches("\\w+"); // The quantifier + specifies that the String must have 1 or more MetaCharacter
        System.out.println(regex);

    }

}
