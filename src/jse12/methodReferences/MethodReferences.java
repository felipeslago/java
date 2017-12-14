package jse12.methodReferences;

public class MethodReferences {

    /**
     * As expressões lambdas são utilizadas para criar métodos anônimos, porém muitas a expressão apenas chamam um método já existente
     * Nesse caso, o uso de Method References pode facilitar essas chamadas de uma maneira compacta e fácil de entender
     */

    /**
     * Imagine a interface de uma calculadora que realiza uma operação com dois números (int a, int b)
     */
    interface Calc {

        int execute (int a, int b);
    }

    /**
     * Agora imagine que já existe uma classe que tem a mesma assinatura de método (retorno e parâmetros iguais)
     */
    class CustomCalc {

        public int calculate (int a, int b, Calc calculator) {
            return calculator.execute(a, b);
        }
    }

    static int addition (final int a, final int b) {
        return a + b;
    }

    public static void main (String[] args) {
        MethodReferences methodReferences = new MethodReferences();
        CustomCalc customCalc = methodReferences.new CustomCalc();

        /**
         * Criação de uma operação de adição usando lambda
         */
        Calc addition = (a, b) -> a + b;
        customCalc.calculate(1, 1, addition);

        /**
         * Chamada direta passando como parâmetro o método de mesma assinatura já existente
         */
        customCalc.calculate(1, 1, MethodReferences::addition);
    }

}
