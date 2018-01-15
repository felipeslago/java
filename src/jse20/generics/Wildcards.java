package jse20.generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {

    /**
     * Wildcards são tipos desconhecidos dentro dos generics, ou seja, não obrigam a especificar o tipo a ser recebido
     */

    /**
     * Este método recebe uma lista de um tipo desconhecido (Unbounded)
     */

    static void printUnknow(List<?> list) {
        for (Object s : list) {
            System.out.println(s.toString());
        }
    }

    /**
     * Este método recebe uma lista de um tipo desconhecido, desde que seja descendente de Number (Upper Bounded)
     */

    static void printNumber(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n.toString());
        }
    }

    /**
     * Este método recebe uma lista de um tipo desconhecido, porém restrito a classes que suportem Integer, como a
     * própria classe Integer, Number ou Object (Lower Bounded)
     */

    static void printInteger(List<? super Integer> list) {
        for (Object i : list) {
            int aux = (Integer) i;
            System.out.println(String.valueOf(aux));
        }
    }

    /**
     * Também é possível retornar um valor de um tipo desconhecido *** MAS NÃO É RECOMENDADO ***
     */

    static List<?> getListAsDouble(List<? extends Number> list) {
        List<Double> doubles = new ArrayList<>();
        for (Number n : list) {
            doubles.add(n.doubleValue());
        }
        return doubles;
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        printUnknow(integers);
        printNumber(integers);
        printInteger(integers);

        List<Double> doubles = (List<Double>) getListAsDouble(integers);
        for (Double d : doubles) {
            System.out.println(d.toString());
        }
    }

    /**
     * OBS.: As regras de Subtype também se aplicam aos Wildcards
     */

}
