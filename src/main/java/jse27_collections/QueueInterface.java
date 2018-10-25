package jse27_collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {

    /**
     * A interface Queue eh uma Collection utilizada para guardar elementos para serem processados, provendo metodos
     * adicionais de insercao, remocao e operacoes de inspecao
     *
     * Normalmente implementa a ordenacao de elementos no esquema FIFO
     *
     * Os metodos adicionais offer, poll e peek oferecem retornos especiais (null ou false) ao inves de lancar uma
     * excessao, como feito nos metodos tradicionais add, remove e element
     */

    public static void main(String[] args) {
        Queue queue = new LinkedList(Arrays.asList("A", "B", "C", "D", "E"));

        System.out.println(queue.add("F"));
        System.out.println(queue.offer("F"));

        System.out.println(queue.remove());
        System.out.println(queue.poll());

        System.out.println(queue.element());
        System.out.println(queue.peek());
    }

}
