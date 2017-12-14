package jse11.lambdaExpressions;

public class LambdaExpressions {

    /**
     * Um dos por�ns das Anonymous Classes, quando estas implementam apenas um m�todo como necessidade de introduzir uma fun��o como par�metro, � a complexidade e quantidade de c�digos gerados
     * As express�es lambda auxiliam na cria��o de classes com m�todos �nicos de uma maneira mais compacta
     * Interfaces que possuem apenas um m�todo s�o chamadas de interfaces funcionais (Functional Interfaces)
     */

    /**
     * Imagine a interface de uma calculadora que realiza uma opera��o com dois n�meros (int a, int b)
     */
    interface Calc {

        int execute (int a, int b);
    }

    public static void main (String[] args) {

        /**
         * Abaixo uma implementa��o do uso da calculadora, sem o uso de express�es Lambda
         */

        Calc addition = new Calc() {

            @Override
            public int execute (final int a, final int b) {
                return a + b;
            }
        };

        System.out.println("Soma de 5 + 5 = " + addition.execute(5, 5));

        /**
         * Agora a mesma implementa��o, por�m usando express�es Lambda
         */

        Calc additionLambda = (a, b) -> a + b;

        System.out.println("Soma de 5 + 5 = " + additionLambda.execute(5, 5));

        /**
         * O uso de express�es Lambda deixa o c�digo muito mais limpo e leg�vel
         * Lembre-se que somente � poss�vel criar express�es Lambda para interfaces com apenas um m�todo
         */
    }

}
