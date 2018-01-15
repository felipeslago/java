package jse20.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    /**
     * Tamb�m � poss�vel criar m�todos gen�ricos que requisitam seu pr�prio tipo
     *
     * A declara��o de um m�todo gen�rico consiste em informar o tipo a ser recebido entre os braquetes antes do tipo e
     * informar o par�metro tipado a ser recebido
     */

    public static <T> void printGivenList(List<T> list) {
        for (T t : list) {
            System.out.println(t.toString());
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        printGivenList(integers);
    }

}
