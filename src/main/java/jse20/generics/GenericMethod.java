package jse20.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    /**
     * Tambem e possivel criar metodos genericos que requisitam seu proprio tipo
     *
     * A declaracao de um metodo generico consiste em informar o tipo a ser recebido entre os braquetes antes do tipo e
     * informar o parametro tipado a ser recebido
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
