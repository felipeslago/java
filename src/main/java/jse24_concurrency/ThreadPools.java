package jse24_concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class ThreadPools {

    /**
     * As thread pools facilitam a criacao de threads, ou seja, sao servicos que provem a criacao automatica de threads
     * conforme a necessidade da apliacao
     *
     * Atraves da classe Executors eh possivel criar dois tipos de thread pools:
     *
     * newCachedThreadPool - cria um cache de threads, que vai enfileirando e executando as threads conforme forem
     * liberados espacos para a execucao, podendo expandir a capacidade de threads de acordo com a demanda
     *
     * newSingleThreadExecutor - cria uma fila unica de execucao, em que cada thread eh executada uma por vez
     *
     * E atraves das classes ScheduledThreadPoolExecutor e ThreadPoolExecutor eh possivel criar pools de threads com
     * tamanhos especificos, que acompanham algumas opcoes e metodos adicionais
     */

    static class Hello {
        private int id;

        public Hello(int id) {
            this.id = id;
        }

        public void execute() {
            try {
                Thread.sleep(5000);
                System.out.println("Hello World from thread ID: " + this.id);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Hello hello1 = new Hello(1);
        Hello hello2 = new Hello(2);
        Hello hello3 = new Hello(3);
        Hello hello4 = new Hello(4);
        Hello hello5 = new Hello(5);
        Hello hello6 = new Hello(6);

        ExecutorService cachedExecutor = Executors.newCachedThreadPool();
        cachedExecutor.submit(hello1::execute);
        cachedExecutor.submit(hello2::execute);
        cachedExecutor.shutdown();

        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
        singleExecutor.submit(hello3::execute);
        singleExecutor.submit(hello4::execute);
        singleExecutor.shutdown();

        ExecutorService scheduledExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledExecutor.submit(hello5::execute);
        scheduledExecutor.submit(hello6::execute);
        scheduledExecutor.shutdown();
    }

}
