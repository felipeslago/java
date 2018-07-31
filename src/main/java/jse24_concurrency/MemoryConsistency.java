package jse24_concurrency;

public class MemoryConsistency {

    /**
     * Outro problema que pode surgir com o uso de threads eh a inconsistencia de memoria
     *
     * No exemplo abaixo, duas threads acessam ao mesmo tempo o mesmo objeto "count" na memoria Porem, nada impede que
     * enquanto a Thread2 esteja mostrando o valor de count a Thread1 ja nao o tenha alterado Causando assim uma
     * inconsistencia dos dados
     */

    static class Num {
        public int count = 0;
    }

    static class MyRunnable1 implements Runnable {

        Num num;

        public MyRunnable1(Num num) {
            this.num = num;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                num.count = i;
                System.out.println(Thread.currentThread().getName() + " - add - " + num.count);
            }
        }
    }

    static class MyRunnable2 implements Runnable {

        Num num;

        public MyRunnable2(Num num) {
            this.num = num;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - show - " + num.count);
            }
        }
    }

    public static void main(String[] args) {
        Num num = new Num();
        Thread t1 = new Thread(new MyRunnable1(num));
        Thread t2 = new Thread(new MyRunnable2(num));

        t1.start();
        t2.start();
    }

}
