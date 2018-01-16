package jse22.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionClass {

    // The object that represents an exception is the Exception object
    // Every exception descend from this object, it is the inheritance concept

    // There are two type of exceptions
    // Unchecked: this exception is treated in execution time and doesn't need to be treated
    // Checked: this exception must be treated or the program will not compile

    public static void main(String[] args) {

        int i = 2 / 0; // This is an Unchecked exception (division by zero)
        System.out.println(i);

        try {
            FileInputStream fis = new FileInputStream("file.txt"); // This is checked exception and must be treated

            // There are two ways of treating checked exceptions
            // One way is surrounding the code using try/catch like this code
            // And the other is move forward the exception, obligating the class who calls the method to treat it

            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
