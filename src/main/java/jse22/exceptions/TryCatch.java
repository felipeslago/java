package jse22.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatch {

    public static void main(String[] args) {

        try {

            // Put inside the try block all the code that must be treated
            // When a exception is caught the next line that will execute is the catch instruction
            // So if there are more instructions inside the try block, it will not be executed

            FileInputStream fis = new FileInputStream("file.txt");
            fis.close();

        } catch (IOException e) { // Inside the parentheses is declared the type of exception it will receive by the try
                                  // block

            // Put inside the catch block all the treatment code to solve or to workaround the exception

            e.printStackTrace();
        } catch (RuntimeException e) {

            // It is possible to treat any new exception by adding a new catch block

            e.printStackTrace();

        } finally {

            // The finally block always executes, independent if was caught or not an exception
            // This block is normally used to close readers and connections

        }

    }

}
