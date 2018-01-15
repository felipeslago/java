package jse19.strings;

public class StringBuilderClass {

    public static void main(String[] args) {

        /**
         * Objetos StringBuilder são como objetos String, com a diferença de que podem ser alterados sem a necessidade
         * de fazer uma nova atribuição
         *
         * Strings devem sempre ser utilizadas, a menos em casos que seja necessário uma melhor performance (ao
         * concatenar e manipular o conteúdo) ou um código mais legível
         */

        StringBuilder stringBuilder = new StringBuilder();

        /**
         * O método append faz a concatenação de novos valores
         */

        stringBuilder.append("Hello");
        stringBuilder.append(" World");

        System.out.println(stringBuilder);

        /**
         * Diferentemente da String, a StringBuilder possuí uma capacidade fixa alocada, porém essa capacidade é
         * expandida conforme seja necessário para acomodar novas inserções
         *
         * O método capacity retorna esse valor
         */

        System.out.println(stringBuilder.capacity());

        /**
         * O método reverse inverte os caracteres da string
         */

        System.out.println(stringBuilder.reverse());

    }

}
