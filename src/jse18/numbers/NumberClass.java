package jse18.numbers;

public class NumberClass {

    /**
     * Quando trabalhamos com números, normalmente utilizamos os tipos primitivos (int, double, long e etc.)
     * Porém, o Java provê classes chamadas wrapper, que envolvem esses tipos primitivos, criando objetos para eles
     */

    public static void main (String[] args) {

        /**
         * Todos os tipos primitivos possuem um wrapper correspondente
         */

        Byte integer8bits; // Inicializando uma variável
        Short integer16bits;
        Integer integer32bits;
        Long integer64bits;
        Float floatingPoint32BitsNumber;
        Double floatingPoint64BitsNumber;
        Boolean bool;
        Character character;

        /**
         * Todas as classes wrapper numéricas extendem da classe abstrata Number
         * A classe abstrata Number por sua vez já possuí métodos abstrator que devem ser implementados pelas classes que a extendem
         * Dessa forma é possível fazer o uso do polimorfismo
         */

        Number number = new Integer(1);

        System.out.println("Valor: " + number.intValue());

    }

}
