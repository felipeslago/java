package jse24_concurrency;

public class RunnableInterface implements Runnable {

    /**
     * A interface Runnable define um unico metodo run, que contem o codigo a ser executado na thread
     */

    @Override
    public void run() {
        System.out.println("Hello froma a thread!");
    }

    public static void main(String[] args) {

        /**
         * O metodo start inicia a nova thread
         */

        (new Thread(new RunnableInterface())).start();
    }
}
