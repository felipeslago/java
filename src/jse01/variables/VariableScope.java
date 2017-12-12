package jse01.variables;

public class VariableScope {

    public static void main (String[] args) {

        /**
         * As {} determinam a criação de um novo escopo
         * Um escopo só pode ser acessado por ele mesmo ou por um escopo dentro dele
         */

        int a = 50;

        System.out.println("Valor de a: " + a);

        {
            int b = 10;

            /**
             * Dentro desse novo escopo a variável 'a pode ser acessada
             */

            System.out.println("Valor de b: " + b);
            System.out.println("Valor de a: " + a);
        }

        /**
         * Porém a variável 'b' não é acessível aqui, pois o escopo dela já acabou
         */

    }

}
