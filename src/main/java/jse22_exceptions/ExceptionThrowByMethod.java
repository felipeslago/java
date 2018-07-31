package jse22_exceptions;

import java.io.IOException;

public class ExceptionThrowByMethod {

    /**
     * Uma das maneiras de lidar com uma exception e lanca-la para o chamador do metodo, ou seja, transferir a
     * responsabilidade de trata-la para quem chamou
     *
     * A palavra throws, na assinatura do metodo, especifica que uma ou mais excecoes serao lancadas e obriga o chamador
     * a trata-las
     */

    public static void throwException() throws IOException {
    }

    public static void main(String[] args) {

        // A simple, but not recommended, way to treat the exception is throwing it forward
        // It is dangerous to do this, because obligate another class to treat an exception generated in this class
        // In other words, this class have the logic, the rules, so who better tang this class to know what to do with
        // an error?

        /**
         * Lancar a excecao para que o chamador a trate e um jeito simples, mas nao recomendado, de como tratar uma
         * excecao
         *
         * Fazendo isso, estamos transferindo a responsabilidade de lidar com esse problema para um metodo que talvez
         * nao saiba como trata-la
         *
         * Em outras palavras, o metodo que lanca a exception, na maior parte das vezes, eh o detentor da logica e das
         * regras de negocio, entao eh o mais indicado a tratar o problema
         */

        try {
            throwException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
