package jse23.javaiIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class Scanning {

    public static void main(String[] args) throws FileNotFoundException {

        /**
         * A classe Scanner auxilia na traducao das leitura de input do programa para uma linguagem de entendimento dos
         * humanos
         *
         * Por padrao, a classe Scanner utiliza como delimitador um espaco (espaco em branco, tabs e delimitador de
         * linhas), ou seja, a cada espaco encontrado, sera gerado um dado agrupado
         *
         * O metodo useDelimiter serve para alterar esse delimitador padrao, sendo possivel fazer a quabra das
         * informacoes por outros caracretes a partir de uma regex
         *
         * O metodo useLocale server para auxiliar no tratamento correto do input, visto que dependendo da localidade,
         * separadores e simbolos decimais podem variar
         */

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("src/main/resources/file.txt")));
            s.useLocale(Locale.US);
            s.useDelimiter(" ");

            while (s.hasNext()) {
                System.out.println(s.next());
            }

        } finally {
            if (s != null) {
                s.close();
            }
        }
    }

}
