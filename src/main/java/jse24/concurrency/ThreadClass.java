package jse24.concurrency;

public class ThreadClass extends Thread {

    /**
     * A execucao de um programa implica na geracao e execucao de um processo
     *
     * Esse processo roda dentro do SO e utiliza a memoria e processamento da maquina reservados para ele
     *
     * Se nos temos um programa que executa X, nos poderiamos entao criar dois processos para executar X ao mesmo tempo
     *
     * Porem isso iria consumir mais recursos da maquina, o que nao seria uma boa ideia
     *
     * Para resolver esse problema, o Java conta com uma API de concorrencia chamada Thread
     *
     * Uma thread executa processamentos paralelos dentro do mesmo processo, ou seja, nao e necessario criar varios
     * processos para executar uma mesma tarefa ao mesmo tempo
     *
     * Dessa forma, a thread ira consumir os recursos do proprio processo
     */

    /**
     * A classe Thread implementa a interface Runnable, porem eh necessario reescrever o metodo run, caso contrario ele
     * nao fara nada
     */

    /**
     * Implementar a interface Runnable eh uma escolha melhor do que extender a classe Thread, pois ao extender uma
     * classe, podemos acabar limitando-a
     */

    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        (new ThreadClass()).start();
    }
}
