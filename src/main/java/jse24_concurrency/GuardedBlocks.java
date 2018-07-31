package jse24_concurrency;

public class GuardedBlocks {

    /**
     * Guarded Blocks eh uma maneira de coordenar a condicao de execucao de uma thread
     *
     * A ideia eh ter um campo que diga quando determinado codigo pode ou nao ser executado
     *
     * Como mostrado abaixo, a thread dispara o metodo doWork que faz a checagem da variavel canWork e enquanto nao for
     * true fica aguardando
     *
     * Ai voce pensa que poderiamos apenas usar o metodo wait sem a necessidade da variavel canWork, porem isso nos
     * traria problemas, visto que cada final de execucao de qualquer thread disparada o metodo notifyAll, fazendo com
     * que o codigo executasse
     */

    static class Work {

        private Boolean canWork = false;

        public synchronized void doWork() {
            String name = Thread.currentThread().getName();

            while (!canWork) {
                System.out.println(name + " waiting to work...");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(name + " work completed");
        }

        public synchronized void letWork() {
            this.canWork = true;
            notifyAll();
        }
    }

    public static void main(String[] args) {
        Work work = new Work();
        new Thread(work::doWork).start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        work.letWork();
    }

}
