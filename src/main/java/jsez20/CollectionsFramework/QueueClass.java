package jsez20.CollectionsFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {

    public static void main(String[] args) {

        // The Queue class is a FIFO structure, that means First In-First Out
        // In other words, in this kind of structure the first element that will be removed is the first element that
        // was inserted

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        System.out.println(queue);

        System.out.println(queue.element()); // The method element returns the first element without removing it and
                                             // throws an exception if the queue is empty

        System.out.println(queue);

        System.out.println(queue.poll()); // The method poll returns the first element and removes it

        System.out.println(queue);

        System.out.println(queue.peek()); // The method peek returns the current item

        System.out.println(queue);

        System.out.println(queue.remove()); // The method remove returns and removes the first element and throws an
                                            // exception if the queue is empty

        System.out.println(queue);
    }

}
