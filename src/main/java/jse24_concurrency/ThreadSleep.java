package jse24_concurrency;

public class ThreadSleep {

    /**
     * O metodo Thread.sleep faz com que a execucao da thread corrente seja suspensa pelo periodo de tempo determinado
     * no argumento do metodo
     *
     * Essa eh uma maneira eficiente de dispobilizar o processador para outras threads da mesma aplicacao ou outras
     * aplicacoes que estejam executando na mesma maquina
     *
     * O metodo Thread.sleep para coordenar a execucao da thread, fazendo com que ela espere por outra thread finalizar
     *
     * Ao utilizar esse metodo teremos que lidar com uma possivel InterruptedException, que sera causada se alguma outra
     * thread tentar interromper a thread atual em espera (suspensa)
     */

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(4000);
        }
    }

}
