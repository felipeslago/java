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
         * Type Inference � a habilidade do compilador em examinar cada chamada de m�todo e sua declara��o corresondendo
         * e determinar o tipo que ser� inferido
         *
         * No caso abaixo, passamos para o m�todo pick uma String e um ArrayList, que s�o objetos de tipos diferentes,
         * por�m ambos implementam a classe Serializable
         *
         * Com essa informa��o, o compilador conseguiu determinar que o tipo seria Serializable e n�o tivemos que
         * explicitar essa informa��o dentro dos braquetes
         */

        Serializable serializable = pick("Hello", world);
        System.out.println(serializable.toString());
    }

}
