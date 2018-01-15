package jse20.generics;

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
         * Type Inference é a habilidade do compilador em examinar cada chamada de método e sua declaração corresondendo
         * e determinar o tipo que será inferido
         *
         * No caso abaixo, passamos para o método pick uma String e um ArrayList, que são objetos de tipos diferentes,
         * porém ambos implementam a classe Serializable
         *
         * Com essa informação, o compilador conseguiu determinar que o tipo seria Serializable e não tivemos que
         * explicitar essa informação dentro dos braquetes
         */

        Serializable serializable = pick("Hello", world);
        System.out.println(serializable.toString());
    }

}
