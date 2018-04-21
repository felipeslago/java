package jse24.concurrency;

public class SynchronizedMethods {

    /**
     * O Java prove uma maneira de evitar a inteferencia de threads e problemas de consistencias de memoria atraves dos
     * metodos sincronizados
     *
     * A declaracao da palavra-chave synchronized na criacao de um metodo faz com que esse metodo possa ser acessado
     * apenas por 1 thread por vez, ou seja, se outra thread tentar acessar o mesmo metodo, ficara em uma fila de
     * espera, ate que a thread atual finalize o uso desse metodo
     */

    static class Counter {
        private int c = 0;

        public synchronized void increment() {
            c++;
        }

        public synchronized void decrement() {
            c--;
        }

        public synchronized int value() {
            return c;
        }
    }

    static class MyRunnable implements Runnable {

        Counter counter;

        public MyRunnable(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);

                    if (i < 7) {
                        counter.increment();
                    } else {
                        counter.decrement();
                    }
                    System.out.println(Thread.currentThread().getName() + " - " + counter.value());

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(new MyRunnable(counter));
        Thread t2 = new Thread(new MyRunnable(counter));

        t1.start();
        t2.start();
    }

}
