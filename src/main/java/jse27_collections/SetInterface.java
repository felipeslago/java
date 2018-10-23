package jse27_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

    public static void main(String[] args) {

        /**
         * A interface Set eh uma Collection que nao pode ter elementos repetidos, alem de ter forte funcionamento com
         * os metodos equals e hashcode, permitindo que instancias de Set sejam comparadas mesmo que suas implementacoes
         * seja diferentes
         *
         * Existem tres implementacoes gerais para a interface Set:
         *
         * HashSet: que guarda seus elementos em uma hashtable, da maneira que for melhor performatico, porem nao
         * garante a ordem em que os elementos foram inseridos
         *
         * TreeSet: que guarda seus elementos em uma red-black tree, ordenando os elementos baseados em seus valores,
         * sendo mais lento em relacao ao HashSet
         *
         * LinkedHashSet: que guarda seus elementos em uma hashtable, porem usando uma lista ligada, mantendo a ordem de
         * insercao de seus elementos
         */

        Set<String> hashSet = new HashSet<>(Arrays.asList("7", "7", "1", "1", "3", "3", "2", "2", "5", "5"));
        Set<String> treeSet = new TreeSet<>(Arrays.asList("7", "7", "1", "1", "3", "3", "2", "2", "5", "5"));
        Set<String> linkedHashSet = new LinkedHashSet<>(
            Arrays.asList("7", "7", "1", "1", "3", "3", "2", "2", "5", "5"));

        System.out.print("HashSet:=");

        for (String s : hashSet) {
            System.out.print(s + " ");
        }

        System.out.print("\nTreeSet:=");

        for (String s : treeSet) {
            System.out.print(s + " ");
        }

        System.out.print("\nLinkedHashSet:=");

        for (String s : linkedHashSet) {
            System.out.print(s + " ");
        }
    }

}
