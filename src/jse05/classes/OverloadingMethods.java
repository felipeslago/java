package jse05.classes;

public class OverloadingMethods {

    /**
     * Através do overload de métodos é possível ter mais de um método com o mesmo nome
     */

    void print (String text) {
        System.out.println("String: " + text);
    }

    /**
     * Temos mais de um método com o mesmo nome, porém recebendo uma quantidade diferente de parâmetros
     */

    void print (String text1, String text2) {
        System.out.println("String 1: " + text1 + ", String 2: " + text2);
    }

    /**
     * Ou podemos ter mais um método com o mesmo nome, com a mesma quantidade de parâmetros, porém com tipos de parâmetros diferentes
     */

    void print (int value) {
        System.out.println("int: " + value);
    }

}
