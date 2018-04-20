package jse24.concurrency;

import java.util.ArrayList;
import java.util.List;

public class _SynchronizedAttribute {

    public static void main(String[] args) throws InterruptedException {

        // Lets think there is a list of numbers and there are many threads running to insert numbers in the list
        // When threads are executing in parallel and the object is not thread-safe, like ArrayList, they block the list
        // while inserting a value
        // So if two or more threads try to access the same object at the same time, just on will get it
        // To avoid it, the object must be synchronized at the insert point and threads must use the method join

        List<Integer> numbers = new ArrayList<>();

        _Number n1 = new _Number(0, 10000, numbers);
        Thread t1 = new Thread(n1);

        _Number n2 = new _Number(10000, 20000, numbers);
        Thread t2 = new Thread(n2);

        t1.start();
        t2.start();

        t1.join(); // The method join allows one thread to wait for another
        t2.join();

        System.out.println("Threads ends");

        for (int i = 0; i < 2000; i++) {
            if (!numbers.contains(i)) {
                System.out.println(i + " not found!");
            }
        }
    }

}
