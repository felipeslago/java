package jse24_concurrency;

public class Livelock {

    /**
     * O livelock eh outro problema que podemos ter ao utilizar a concorrencia
     *
     * Trata-se de uma situacao em que a thread1 fica esperando a thread2 processar, porem a thread2 tambem fica
     * esperando a thread1 processar e as duas acabam ficando em um loop infinito de espera
     */

    static class Work {

        private Boolean workDone = false;

        public synchronized void doWork(Work work) {
            String name = Thread.currentThread().getName();

            while (!work.isWorkDone()) {
                System.out.println(name + " waiting to work...");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(name + " work completed");
            this.workDone = true;
        }

        public Boolean isWorkDone() {
            return workDone;
        }
    }

    public static void main(String[] args) {
        Work work1 = new Work();
        Work work2 = new Work();

        new Thread(() -> work1.doWork(work2)).start();
        new Thread(() -> work2.doWork(work1)).start();
    }
}
