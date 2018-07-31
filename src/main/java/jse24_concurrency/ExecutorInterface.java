package jse24_concurrency;

import java.util.concurrent.Executor;

public class ExecutorInterface {

    /**
     * O pacote de concorrencia do Java dispoe de tres interfaces de execucao
     *
     * Executor: uma interface simples, com um metodo execute que recebe um objeto runnable
     *
     * ExecutorService: uma sub-interface de executor, porem com mais controles de execucao
     *
     * SchedulerExecutorService: uma sub-interface de executor, que suporta implementacoes para agendar execucoes
     */

    static class MyRunnable implements Executor {

        @Override
        public void execute(Runnable command) {
            command.run();
        }
    }

    static class Hello {
        public void execute() {
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Hello hello = new Hello();
        myRunnable.execute(hello::execute);
    }
}
