package jse24.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockObjects {

    /**
     * A classe Lock oferece maneiras mais avancadas de lidar com concorrencia, fornecendo o proprio lock de objetos
     * feitos atraves do uso do synchronized
     *
     * Usando como mesmo exemplo do Deadlock, conseguimos resolver o problema ao fazer uma chegagem antes de executar
     * determinado trecho de codigo
     *
     * Essa checagem permite que quem fez o primeiro lock continue executando, enquanto a segunda thread nao consegue
     * executar
     */

    static class Friend {
        String name;
        Lock lock = new ReentrantLock();

        public Friend(String name) {
            this.name = name;
        }

        public boolean impedingBow(Friend bower) {
            Boolean myLock = false;
            Boolean yourLock = false;

            try {
                myLock = lock.tryLock();
                yourLock = bower.lock.tryLock();
            } finally {
                if (!(myLock && yourLock)) {
                    if (myLock) {
                        lock.unlock();
                    }
                    if (yourLock) {
                        bower.lock.unlock();
                    }
                }
            }
            return myLock && yourLock;
        }

        public synchronized void bow(Friend bower) {
            if (impedingBow(bower)) {
                try {
                    System.out.println(bower.name + " has bowed.");
                    bower.bowBack(this);
                } finally {
                    lock.unlock();
                    bower.lock.unlock();
                }
            } else {
                System.out.println("Tried to bow at same time");
            }
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
