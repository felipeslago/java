package jse04.controlFlow;

public class For {

    public static void main(String[] args) {

        /**
         * A declaracao for e executada ate que determinada condicao seja satisfeita A grande diferenca e que o valor de
         * incremento pode ser definido dentro da propria declaracao
         */

        for (int i = 0; i < 10; i++) {

            /**
             * Primeiramente e definida a variavel que sera iterada Depois disso sao definidas as condicoes E por fim e
             * definido como sera o incremento/decremento da variavel
             */

            System.out.println("Valor de i: " + i);

        }

        /**
         * Uma outra maneira de iterar por colecoes de uma maneira mais facil e atraves da declaracao enhanced-for (for
         * each) Diferente do for tradicional, a declaracao utiliza o objeto Iterator da colecao Atraves desse objeto o
         * for faz o seu proprio controle para verificar se a colecao ainda possui elementos
         */

        System.out.println("---------------------");

        int[] values = { 1, 2, 3, 4, 5 };

        System.out.println("Valores do array values: ");

        for (int value : values) {
            System.out.println(value);
        }

    }

}
