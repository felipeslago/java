package jse24.concurrency;

public class Interrupts {

    /**
     * Uma interrupcao eh uma indicacao para uma thread que ela deve parar de executar o que estiver fazendo
     *
     * Cabe ao programador decidir o que fazer caso uma interrupcao ocorra, mas normalmente a thread eh finalizada
     *
     * Uma thread pode ser interrompida atraves da chamada do metodo interrupt da classe Thread
     */

    /**
     * Se a thread estiver frequentemente chamando o metodo que lanca a excecao InterruptedException
     */

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                return;
            }
            System.out.println(i);
        }
    }

}
