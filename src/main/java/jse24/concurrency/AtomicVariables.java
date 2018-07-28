package jse24.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariables {

    /**
     * As variaveis atomicas oferecem uma maneira de lidar com a concorrencia do uso de uma variavel, lidando com a sua
     * consistencia de memoria
     *
     * Ou seja, ela garante o uso exclusivo (lock) da variavel para quem estiver lendo, incrementando ou decrementando
     */

    static class AtomicCounter {
        private AtomicInteger i = new AtomicInteger(0);

        public void increment() {
            i.incrementAndGet();
        }

        public void decrement() {
            i.decrementAndGet();
        }

        public int value() {
            return i.get();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicCounter counter = new AtomicCounter();
        Thread[] threads = new Thread[1000];

        for (int i = 0; i < 1000; i++) {
            if (i % 10 <= 5) {
                threads[i] = new Thread(counter::increment);
            } else if (i % 10 >= 6 && i % 10 <= 7) {
                threads[i] = new Thread(counter::decrement);
            } else {
                threads[i] = new Thread(counter::value);
            }
        }

        for (int i = 0; i < 1000; i++) {
            threads[i].start();
        }

        for (int i = 0; i < 1000; i++) {
            threads[i].join();
        }

        System.out.println("Counter: " + counter.value());
    }
}
