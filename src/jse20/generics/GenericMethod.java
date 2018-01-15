package jse20.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    /**
     * Também é possível criar métodos genéricos que requisitam seu próprio tipo
     *
     * A declaração de um método genérico consiste em informar o tipo a ser recebido entre os braquetes antes do tipo e
     * informar o parâmetro tipado a ser recebido
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
