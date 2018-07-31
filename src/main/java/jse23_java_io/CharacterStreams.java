package jse23_java_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {

    public static void main(String[] args) throws IOException {

        /**
         * As classes FileReader e FileWriter sao utilizadas para a leitura de caracteres, porem internamente elas
         * utilizam das classes FileInputStream e FileOutputStream
         *
         * Essas classes funcionam como wrappers, fazendo a traducao de byte para caractere (CharacterStreams)
         */

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("src/main/resources/file.txt");
            out = new FileWriter("src/main/resources/remove.txt");

            int c;

            while ((c = in.read()) != -1) {
                System.out.print(c);
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

    }

}
