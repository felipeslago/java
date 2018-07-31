package jse24_concurrency;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoin {

    /**
     * O framework fork/join eh uma implementacao da interface ExecutorService que nos ajuda a tirar vantagem de
     * multiplos processadores
     *
     * Ele foi criado para trabalhos que podem ser quebrados em pedaços menores e executados paralelamente
     *
     * A classe ForkJoinPool eh a responsavel por implementar o algorito de work-stealing e por executar as ForkJoinTaks
     *
     * No exemplo abaixo, temos um algoritmo que calcula a soma das posicoes de um array e quebra esse array a cada 100
     * posicoes para paralelizar o trabalho
     *
     * O metodo sum precisa ser synchronized visto que atualiza uma variavel estatica
     */

    static int totalSum;

    class Execute extends RecursiveAction {

        int[] arr;

        Execute(int[] arr) {
            this.arr = arr;
        }

        @Override
        protected void compute() {
            if (arr.length <= 100) {
                sum();
                return;
            }

            int[] process = Arrays.copyOfRange(arr, 0, 100);
            int[] evaluate = Arrays.copyOfRange(arr, 100, arr.length);
            invokeAll(new Execute(process), new Execute(evaluate));
        }

        private synchronized void sum() {
            if (arr != null) {
                int sum = 0;

                for (int i : arr) {
                    sum += i;
                }

                totalSum += sum;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];

        for (int i = 0; i < 1000; i++) {
            arr[i] = i + 1;
        }

        ForkJoin forkJoin = new ForkJoin();
        Execute execute = forkJoin.new Execute(arr);

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.invoke(execute);

        System.out.println(String.format("Sum=%d", totalSum));
    }

}
