package jse27_collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapInterface {

    /**
     * A interface Map eh um objeto que mapeia chaves e valores, em que uma chave pode mapear apenas um valor
     *
     * Existem tres implementacoes gerais para a interface Map:
     *
     * HashMap: que guarda seus elementos em uma hashtable, da maneira que for melhor performatico, porem nao garante a
     * ordem em que os elementos foram inseridos
     *
     * TreeMap: que guarda seus elementos em uma red-black tree, ordenando os elementos baseados em seus valores, sendo
     * mais lento em relacao ao HashMap
     *
     * LinkedHashMap: que guarda seus elementos em uma hashtable, porem usando uma lista ligada, mantendo a ordem de
     * insercao de seus elementos
     */

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> treeMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new HashMap<>();

        int key = 1;

        for (String s : Arrays.asList("A", "B", "C", "D", "E")) {
            hashMap.put(key, s);
            treeMap.put(key, s);
            linkedHashMap.put(key, s);
            key++;
        }

        System.out.println(">>>> HashMap");

        for (Map.Entry<Integer, String> e : hashMap.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        System.out.println(">>>> TreeMap");

        for (Map.Entry<Integer, String> e : treeMap.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        System.out.println(">>>> LinkedHashMap");

        for (Map.Entry<Integer, String> e : linkedHashMap.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

    }
}
