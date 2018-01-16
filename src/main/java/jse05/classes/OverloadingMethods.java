package jse05.classes;

public class OverloadingMethods {

    /**
     * Atraves do overload de metodos e possivel ter mais de um metodo com o mesmo nome
     */

    void print(String text) {
        System.out.println("String: " + text);
    }

    /**
     * Temos mais de um metodo com o mesmo nome, porem recebendo uma quantidade diferente de parametros
     */

    void print(String text1, String text2) {
        System.out.println("String 1: " + text1 + ", String 2: " + text2);
    }

    /**
     * Ou podemos ter mais um metodo com o mesmo nome, com a mesma quantidade de parametros, porem com tipos de
     * parametros diferentes
     */

    void print(int value) {
        System.out.println("int: " + value);
    }

}
