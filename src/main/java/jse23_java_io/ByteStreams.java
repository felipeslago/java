package jse23_java_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {

    /**
     * Uma I/O Stream, representa a entrada e saida de dados de um programa, seja de dispositivos, outros programas,
     * memoria e disco do computador
     *
     * As streams suportam muitos tipos de dados, desde dados primitivos a objetos e sempre trabalham da mesma forma:
     * lendo uma sequencia de dados
     */

    public static void main(String[] args) throws IOException {

        /**
         * As classes FileInputStream e FileOutputStream sao utilizadas para a leitura de dados primitivos, lendo byte a
         * byte (Byte Streams)
         *
         * Ao criar um objeto Input ou Output, sao abertos leitores de arquivos, que se nao forem fechados, podem
         * ocasionar em vazamento de memoria e indisponibilidade dos arquivos para outros processos/programas
         *
         * Portanto, o metodo close dos leitores deve sempre ser chamado, ou entao podemos fazer uso do try with
         * resources que fara isso automaticamente para nos
         */

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("src/main/resources/file.txt");
            out = new FileOutputStream("src/main/resources/remove.txt");

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
