package jse27_collections;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class DequeInterface {

    /**
     * A interface Queue eh uma Collection double-ended-queue, ou seja, eh uma colecao linear de elementos que suporta
     * insercao e remocao tanto no inicio, quanto no fim da fila
     *
     * Implementa tanto uma Stack quanto uma Queue
     *
     * Os metodos adicionais oferecidos pela Queue tambem estao presentes, porem com a inclusao das palavras First e
     * Last
     */

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList(Arrays.asList("A", "B", "C", "D", "E"));

        deque.addFirst("F");
        deque.offerFirst("E");

        deque.addLast("Z");
        deque.offerLast("A");
    }

}
