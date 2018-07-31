package jse20_generics;

import java.io.Serializable;
import java.util.ArrayList;

public class TypeInference {

    static <T> T pick(T t1, T t2) {
        return t2;
    }

    public static void main(String[] args) {
        String hello = "Hello";
        ArrayList<String> world = new ArrayList<>();
        world.add("World");

        /**
         * Type Inference e a habilidade do compilador em examinar cada chamada de metodo e sua declaracao corresondendo
         * e determinar o tipo que sera inferido
         *
         * No caso abaixo, passamos para o metodo pick uma String e um ArrayList, que sao objetos de tipos diferentes,
         * porem ambos implementam a classe Serializable
         *
         * Com essa informacao, o compilador conseguiu determinar que o tipo seria Serializable e nao tivemos que
         * explicitar essa informacao dentro dos braquetes
         */

        Serializable serializable = pick("Hello", world);
        System.out.println(serializable.toString());
    }

}
