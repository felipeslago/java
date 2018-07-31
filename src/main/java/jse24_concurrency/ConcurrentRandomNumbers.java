package jse24_concurrency;

import java.util.concurrent.ThreadLocalRandom;

public class ConcurrentRandomNumbers {

    /**
     * A classe ThreadLocalRandom deve ser utilizada em aplicacoes que utilizem multiplas threads ou ForkJoinTasks e
     * precisam de um numero randomico
     *
     * Sua performance eh bem superior ao uso do Math.random()
     */

    static class RandomNumber {
        public int getRandomValue() {
            return ThreadLocalRandom.current().nextInt();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RandomNumber randomNumber = new RandomNumber();
        Thread[] threads = new Thread[1000];

        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(() -> System.out.println(randomNumber.getRandomValue()));
        }

        for (int i = 0; i < 1000; i++) {
            threads[i].start();
        }

        for (int i = 0; i < 1000; i++) {
            threads[i].join();
        }
    }
}
