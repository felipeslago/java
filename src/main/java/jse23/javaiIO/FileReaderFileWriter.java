package jse23.javaiIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderFileWriter {

    public static void main(String[] args) throws IOException {

        // Another way to read and write in files

        FileReader fr = new FileReader("readFile.txt");
        FileWriter fw = new FileWriter("writeFile.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = "";

        try {

            while ((s = br.readLine()) != null) {
                fw.write(s);
                s = br.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            br.close();
            fw.close();
        }

    }

}
