package jse24_concurrency;

public class ThreadInterference {

    /**
     * A classe Counter foi escrita para incrementar e decrementar valores do variavel c Enquanto a classe MyRunnable
     * foi escrita para iterar chamando os metodos da classe Counter
     *
     * Porem, ao ser manipulada por duas threads diferentes, executando ao mesmo tempo, o resultado nao eh o esperado
     * Neste caso ocorre uma interferencia de threads, ou seja, enquanto uma thread chama o metodo para incrementar, a
     * outra thread pode chamar esse mesmo metodo ou ainda o metodo para decrementar, errando o resultado final
     */

    static class Counter {
        private int c = 0;

        public void increment() {
            c++;
        }

        public void decrement() {
            c--;
        }

        public int value() {
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
