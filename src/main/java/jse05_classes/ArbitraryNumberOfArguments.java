package jse05_classes;

public class ArbitraryNumberOfArguments {

    /**
     * e possivel criar um metodo que receba inumeros objetos, atraves do construtor chamado varargs (...)
     */

    void print(String... values) {
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

    void print(int... values) {
        int n = 1;
        System.out.println("Total de numeros recebidos: " + values.length);
        for (int i : values) {
            System.out.println("Numero " + n + ": " + i);
            n++;
        }
    }

}
