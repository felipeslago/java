package jse24.concurrency;

public class Interrupts {

    /**
     * Uma interrupcao eh uma indicacao para uma thread que ela deve parar de executar o que estiver fazendo
     *
     * Cabe ao programador decidir o que fazer caso uma interrupcao ocorra, mas normalmente a thread eh finalizada
     *
     * Uma thread pode ser interrompida atraves da chamada do metodo interrupt da classe Thread
     */

    public static void main(String[] args) {

        /**
         * Se a thread estiver frequentemente chamando o metodo que lanca a excecao InterruptedException, ela
         * simplesmente retorna ao pegar a exception
         */

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                return;
            }
            System.out.println(i);
        }

        /**
         * Outra maneira eh verificar se a thread foi interrompida atraves do metodo estatico interrupted
         *
         * Ao chamar o metodo interrupt de uma thread, a flag interrupt status eh marcada como true
         *
         * Quando o metodo estatico interrupted eh chamado, essa flag eh marcada como false
         *
         * Porem, se um metodo interrupted nao estatico for chamado, essa flag nao eh alterada
         */

        for (int i = 0; i < 10; i++) {
            if (Thread.interrupted()) {
                return;
            }
            System.out.println(i);
        }
    }

}
