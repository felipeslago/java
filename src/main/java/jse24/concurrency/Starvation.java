package jse24.concurrency;

public class Starvation {

    /**
     * Outro problema comum ao lidar com concorrencia eh a Starvation
     *
     * Quando temos um metodo que demora muito para responder, ou uma thread que usa muito este metodo e tem preferencia
     * na frente de outras, como por exemplo o metodo doWork da classe Work (abaixo), ela esta praticamente bloqueando
     * esse recurso para que demais threads possam usa-lo tambem
     *
     * Como temos abaixo, a primeira thread a obter o recurso do metodo doWork ficara nela infinitamente, nao deixando
     * que outras threads que ja foram disparadas acessem esse metodo
     *
     * Uma maneira de resolver esse problema, seria colocar o metodo wait(1000) dentro do while, permitindo assim que
     * outras threads possam entrar no metodo enquanto a thread atual aguarda
     */

    static class Work {
        public synchronized void doWork() {
            String name = Thread.currentThread().getName();
            try {
                while (true) {
                    System.out.println(name + " is working.");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Work work = new Work();

        for (int i = 0; i < 10; i++) {
            new Thread(work::doWork).start();
        }
    }
}
