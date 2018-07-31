package jse19_strings;

public class StringBuilderClass {

    public static void main(String[] args) {

        /**
         * Objetos StringBuilder sao como objetos String, com a diferenca de que podem ser alterados sem a necessidade
         * de fazer uma nova atribuicao
         *
         * Strings devem sempre ser utilizadas, a menos em casos que seja necessario uma melhor performance (ao
         * concatenar e manipular o conteudo) ou um codigo mais legivel
         */

        StringBuilder stringBuilder = new StringBuilder();

        /**
         * O metodo append faz a concatenacao de novos valores
         */

        stringBuilder.append("Hello");
        stringBuilder.append(" World");

        System.out.println(stringBuilder);

        /**
         * Diferentemente da String, a StringBuilder possui uma capacidade fixa alocada, porem essa capacidade e
         * expandida conforme seja necessario para acomodar novas insercoes
         *
         * O metodo capacity retorna esse valor
         */

        System.out.println(stringBuilder.capacity());

        /**
         * O metodo reverse inverte os caracteres da string
         */

        System.out.println(stringBuilder.reverse());

    }

}
