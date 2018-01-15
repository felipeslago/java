package jse19.strings;

public class StringBuilderClass {

    public static void main(String[] args) {

        /**
         * Objetos StringBuilder s�o como objetos String, com a diferen�a de que podem ser alterados sem a necessidade
         * de fazer uma nova atribui��o
         *
         * Strings devem sempre ser utilizadas, a menos em casos que seja necess�rio uma melhor performance (ao
         * concatenar e manipular o conte�do) ou um c�digo mais leg�vel
         */

        StringBuilder stringBuilder = new StringBuilder();

        /**
         * O m�todo append faz a concatena��o de novos valores
         */

        stringBuilder.append("Hello");
        stringBuilder.append(" World");

        System.out.println(stringBuilder);

        /**
         * Diferentemente da String, a StringBuilder possu� uma capacidade fixa alocada, por�m essa capacidade �
         * expandida conforme seja necess�rio para acomodar novas inser��es
         *
         * O m�todo capacity retorna esse valor
         */

        System.out.println(stringBuilder.capacity());

        /**
         * O m�todo reverse inverte os caracteres da string
         */

        System.out.println(stringBuilder.reverse());

    }

}
