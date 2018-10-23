package jse27_collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionInterface {

    public static void main(String[] args) {

        /**
         * A interface Collection pode ser utilizada par manipular de maneira generica classes que a implementem
         *
         * Nos exemplos abaixo diferentes tipos de colecao foram atribuidas a variaveis do tipo Collection e logo depois
         * foram executados metodos em comum, que funcionam independente do tipo de lista, como add/size/remove/contains
         */

        Collection<String> arrayList = new ArrayList<>(Arrays.asList("A", "B", "C"));
        Collection<String> hashSet = new HashSet(Arrays.asList("A", "B", "C"));
        Collection<String> queue = new LinkedList(Arrays.asList("A", "B", "C"));
        Collection<String> deque = new ArrayDeque(Arrays.asList("A", "B", "C"));

        System.out.println(arrayList.size());
        System.out.println(hashSet.size());
        System.out.println(queue.size());
        System.out.println(deque.size());

        arrayList.add("D");
        hashSet.add("D");
        queue.add("D");
        deque.add("D");

        System.out.println(arrayList.size());
        System.out.println(hashSet.size());
        System.out.println(queue.size());
        System.out.println(deque.size());

        System.out.println(arrayList.remove("D"));
        System.out.println(hashSet.remove("D"));
        System.out.println(queue.remove("D"));
        System.out.println(deque.remove("D"));

        System.out.println(arrayList.contains("D"));
        System.out.println(hashSet.contains("D"));
        System.out.println(queue.contains("D"));
        System.out.println(deque.contains("D"));

        /**
         * Eh possivel iterar nas colecoes atraves das streams (Java 8 em diante)
         */

        arrayList.stream().forEach(System.out::println);

        /**
         * Usando o foreach
         */

        for (String s : arrayList) {
            System.out.println(s);
        }

        /**
         * Ou usando um iterator
         */

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /**
         * A interface Collection tambem dispoe de metodo de processamento em massa, ou seja, metodo que executam na
         * colecao inteira, como removeAll/addAll
         */

        System.out.println(arrayList.removeAll(hashSet));
        System.out.println(arrayList.addAll(hashSet));

        /**
         * Tambem eh possivel transformar a colecao em um simples array
         */

        Object[] arr = arrayList.toArray();

    }

}
