package jse05.classes;

public class ArbitraryNumberOfArguments {

    /**
     * � poss�vel criar um m�todo que receba in�meros objetos, atrav�s do construtor chamado varargs (...)
     */

    void print (String... values) {
        int n = 1;
        System.out.println("Total de Strings recebidas: " + values.length);
        for (String s : values) {
            System.out.println("String " + n + ": " + s);
            n++;
        }
    }

    /**
     * O varargs (...) recebe um array de objetos do tipo declarado
     */

    void print (int... values) {
        int n = 1;
        System.out.println("Total de n�meros recebidos: " + values.length);
        for (int i : values) {
            System.out.println("N�mero " + n + ": " + i);
            n++;
        }
    }

}
