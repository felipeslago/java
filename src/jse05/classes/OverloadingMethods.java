package jse05.classes;

public class OverloadingMethods {

    /**
     * Atrav�s do overload de m�todos � poss�vel ter mais de um m�todo com o mesmo nome
     */

    void print (String text) {
        System.out.println("String: " + text);
    }

    /**
     * Temos mais de um m�todo com o mesmo nome, por�m recebendo uma quantidade diferente de par�metros
     */

    void print (String text1, String text2) {
        System.out.println("String 1: " + text1 + ", String 2: " + text2);
    }

    /**
     * Ou podemos ter mais um m�todo com o mesmo nome, com a mesma quantidade de par�metros, por�m com tipos de par�metros diferentes
     */

    void print (int value) {
        System.out.println("int: " + value);
    }

}
