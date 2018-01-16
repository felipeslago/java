package jse04.controlFlow;

public class LoopScope {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            /**
             * Dentro desse loop esta o escopo da variavel i
             */
            System.out.println(i);

        }

        /**
         * Porem a variavel i nao existe mais aqui
         */

    }

}
