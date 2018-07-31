package z.z26_RegularExpressions;

public class Modifiers {

    public static void main(String[] args) {

        // Modifiers are used to change how the function will treat the pattern

        String text = "Java";
        boolean regex = false;

        regex = text.matches("java"); // It is false because the j is lower case
        System.out.println(regex);

        regex = text.matches("(?i)java"); // The (?i) modifier ignores lower case and upper case
        System.out.println(regex);

    }
}
