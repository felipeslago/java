package jse11_lambda_expressions;

public class LambdaExpressions {

    /**
     * Um dos porens das Anonymous Classes, quando estas implementam apenas um metodo como necessidade de introduzir uma
     * funcao como parametro, e a complexidade e quantidade de codigos gerados As expressoes lambda auxiliam na criacao
     * de classes com metodos unicos de uma maneira mais compacta Interfaces que possuem apenas um metodo sao chamadas
     * de interfaces funcionais (Functional Interfaces)
     */

    /**
     * Imagine a interface de uma calculadora que realiza uma operacao com dois numeros (int a, int b)
     */
    interface Calc {

        int execute(int a, int b);
    }

    public static void main(String[] args) {

        /**
         * Abaixo uma implementacao do uso da calculadora, sem o uso de expressoes Lambda
         */

        Calc addition = new Calc() {

            @Override
            public int execute(final int a, final int b) {
                return a + b;
            }
        };

        System.out.println("Soma de 5 + 5 = " + addition.execute(5, 5));

        /**
         * Agora a mesma implementacao, porem usando expressoes Lambda
         */

        Calc additionLambda = (a, b) -> a + b;

        System.out.println("Soma de 5 + 5 = " + additionLambda.execute(5, 5));

        /**
         * O uso de expressoes Lambda deixa o codigo muito mais limpo e legivel Lembre-se que somente e possivel criar
         * expressoes Lambda para interfaces com apenas um metodo
         */
    }

}
