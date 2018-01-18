package jse23.javaiIO;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandLine {

    public static void main(String[] args) throws IOException {
        /**
         * Através das classes InputStreamReader e BufferedReader eh possivel ler dados do console do usuario (linha de
         * comando) usando o objeto System.in
         *
         * A cada chamado ao metodo readLine o programa fica aguardando por input de dados pelo usuario, que serao lidos
         * apos a tecla enter ser pressionada
         */

        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        String input;

        input = cin.readLine();
        System.out.println(input);

        /**
         * A classe Console oferece uma maneira mais avançada e segura de obter informacoes via linha de comando do
         * usuario
         *
         * Alem de possuir todas as features das Streams, ainda conta com um metodo readPassword, para tratar de maneira
         * segura o input dessa informacao
         */

        Console c = System.console();

        if (c == null) {
            System.out.println("Sem console");
            System.exit(1);
        }

        String text = c.readLine("Digite qualquer texto: ");
        char[] passwod = c.readPassword("Digite qualquer senha: ");

        System.out.println(text);
        System.out.println(passwod);
    }

}
