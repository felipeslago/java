package jse23_java_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreams {

    public static void main(String[] args) throws IOException {

        /**
         * As classes de Byte Stream e Character Stream utilizam um conceito chamado unbuffered I/O, ou seja, toda vez
         * que um dado eh lido ou gravado, o sistema operacional tem que realizar os acessos necessarios para realizar a
         * operacao, deixando o programa muito pouco eficiente
         *
         * Para auxiliar a leitura e escrita de arquivos, sem consumir muito do sistema operacional, o Java dispoe das
         * classes Buffered Stream (BufferedInputStream e BufferedOutputStream para trabalhar com Byte Streams e
         * BufferedReader e BufferedWriter para trabalhar com Character Streams)
         *
         * As classes Buffered Stream trabalhar com com areas da memoria do computador (buffer) e carregam um pouco do
         * conteudo do arquivo da primeira vez que o acessam, sendo necessario chamar o sistema operacional novamente
         * apenas quando o buffer estiver vazio
         */

        BufferedInputStream in = null;
        BufferedOutputStream out = null;

        try {
            in = new BufferedInputStream(new FileInputStream("src/main/resources/file.txt"));
            out = new BufferedOutputStream(new FileOutputStream("src/main/resources/remove.txt"));

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
