package jse11.lambdaExpressions;

public class LambdaExpressions {

    /**
     * Um dos poréns das Anonymous Classes, quando estas implementam apenas um método como necessidade de introduzir uma função como parâmetro, é a complexidade e quantidade de códigos gerados
     * As expressões lambda auxiliam na criação de classes com métodos únicos de uma maneira mais compacta
     * Interfaces que possuem apenas um método são chamadas de interfaces funcionais (Functional Interfaces)
     */

    /**
     * Imagine a interface de uma calculadora que realiza uma operação com dois números (int a, int b)
     */
    interface Calc {

        int execute (int a, int b);
    }

    public static void main (String[] args) {

        /**
         * Abaixo uma implementação do uso da calculadora, sem o uso de expressões Lambda
         */

        Calc addition = new Calc() {

            @Override
            public int execute (final int a, final int b) {
                return a + b;
            }
        };

        System.out.println("Soma de 5 + 5 = " + addition.execute(5, 5));

        /**
         * Agora a mesma implementação, porém usando expressões Lambda
         */

        Calc additionLambda = (a, b) -> a + b;

        System.out.println("Soma de 5 + 5 = " + additionLambda.execute(5, 5));

        /**
         * O uso de expressões Lambda deixa o código muito mais limpo e legível
         * Lembre-se que somente é possível criar expressões Lambda para interfaces com apenas um método
         */
    }

}
