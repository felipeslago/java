package jse24.concurrency;

import java.util.List;

public class SynchronizedStatements {

    /**
     * A sincronizacao eh feita atraves de uma entidade interna conhecida como intrinsic lock ou monitor lock
     *
     * Essa entidade prove regras de sincronizacao, como por exemplo, quando uma thread precisa de acesso exclusivo a um
     * campo/metodo de um objeto, ela vira dona do intrinsic lock antes de acessa-lo
     *
     * O intrinsic lock garante que o campo/metodo acessado esteja lockado apenas para uma thread, que ao finalizar o
     * uso desse objeto, libera o intrinsic lock para a proxima thread que ira usa-lo
     *
     * Quando um campo/metodo estatico eh sincronizado, o controle de intrinsic lock passa a ser feito na classe
     * (.class) e nao mais no objeto, devido ao fato de campos/metodos estaticos nao serem instanciados
     */

    /**
     * A primeira maneira de sincronizar atraves do uso de declaracao eh criar um bloco de codigo usando a palavra-chave
     * synchronized passando como parametro a palavra-chave this (referencia a propria instancia)
     */

    class AllClassSynchronized {
        List<String> nameList;
        String lastName;
        Integer nameCount;

        public void addName(String name) {
            synchronized (this) {
                lastName = name;
            }
            nameList.add(name);
        }
    }

    /**
     * A outra maneira eh sincronizar objetos ao inves de sincronizar a instancia da classe toda Perceba que os objetos
     * lock1 e lock2 sao sincronizados, permitindo que threads diferentes chamem os metodos inc1 e inc2 ao mesmo tempo
     */

    class ObjectsSynchronized {
        long c1 = 0;
        long c2 = 0;
        Object lock1 = new Object();
        Object lock2 = new Object();

        public void inc1() {
            synchronized (lock1) {
                c1++;
            }
        }

        public void inc2() {
            synchronized (lock2) {
                c2++;
            }
        }
    }

}
