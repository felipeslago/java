package jse25.plataformEnvironment;

public class Miscellaneous {

    /**
     * A classe System dispoe de alguns metodos que executam diversas tarefas
     *
     * Entre eles, podemos destacar o arraycopy que faz uma copia de um array para o outro, o currentTimeMillis que
     * devolve a data atual em milisegundos e exit que encerra o programa
     */

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] b = new int[3];

        System.arraycopy(a, 2, b, 0, 3);

        for (int i : b) {
            System.out.println(i);
        }

        System.out.println(System.currentTimeMillis());

        System.exit(0);
    }

}
