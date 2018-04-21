package jse24.concurrency;

public class Deadlock {

    /**
     * Ao utilizar a sincronizacao, um dos problemas mais comuns eh o dead lock
     *
     * Quando ocorre um dead lock, duas ou mais threads ficam bloqueadas para sempre, uma esperando a outra finalizar
     *
     * No exemplo abaixo, a thread 1 chama o metodo bow passando o objeto B, enquanto a thread 2 chama o metodo bow
     * passando o objeto A
     *
     * As threads ficaram bloqueadas quando tentarem chamar o metodo bowBack e o bloqueio nunca ira acabar, pois cada
     * thread esta aguardando que a outra libere o metodo bow
     */

    static class Friend {
        String name;

        public Friend(String name) {
            this.name = name;
        }

        public synchronized void bow(Friend bower) {
            System.out.println(name + " has bowed.");
            bower.bowBack(this);
        }

        public synchronized void bowBack(Friend bower) {
            System.out.println(bower.name + " has bowed back.");
        }
    }

    public static void main(String[] args) {
        Friend A = new Friend("A");
        Friend B = new Friend("B");

        new Thread(() -> A.bow(B)).start();

        new Thread(() -> B.bow(A)).start();
    }

}
