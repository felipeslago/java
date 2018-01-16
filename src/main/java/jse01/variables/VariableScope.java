package jse01.variables;

public class VariableScope {

    public static void main(String[] args) {

        /**
         * As {} determinam a criacao de um novo escopo Um escopo so pode ser acessado por ele mesmo ou por um escopo
         * dentro dele
         */

        int a = 50;

        System.out.println("Valor de a: " + a);

        {
            int b = 10;

            /**
             * Dentro desse novo escopo a variavel 'a pode ser acessada
             */

            System.out.println("Valor de b: " + b);
            System.out.println("Valor de a: " + a);
        }

        /**
         * Porem a variavel 'b' nao e acessivel aqui, pois o escopo dela ja acabou
         */

    }

}
