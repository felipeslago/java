package jse24.concurrency;

public class Joins {

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("Thread started:::" + Thread.currentThread().getName());
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread ended:::" + Thread.currentThread().getName());
        }
    }

    /**
     * O metodo join permite que uma thread aguarde o fim da execucao de outra, para assim poder continuar sua execucao
     *
     * No exemplo abaixo, 3 threads sao iniciadas, com um tread sleep de 4 segundos cada, porem a thread principal (o
     * metodo main) so ira executar a ultima linha quando todas as threads finalizarem
     *
     * Por sua vez, a thread 2 soh ira executar quando a thread 1 finalizar e assim segue para a thread 3
     */

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();

        System.out.println("All threads are dead, exiting main thread");
    }

}