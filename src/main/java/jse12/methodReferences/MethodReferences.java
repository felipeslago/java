package jse12.methodReferences;

public class MethodReferences {

    /**
     * As expressoes lambdas sao utilizadas para criar metodos anonimos, porem muitas vezes a expressao apenas chama um
     * metodo ja existente Nesse caso, o uso de Method References pode facilitar essas chamadas de uma maneira compacta
     * e facil de entender
     */

    /**
     * Imagine a interface de uma calculadora que realiza uma operacao com dois numeros (int a, int b)
     */
    interface Calc {

        int execute(int a, int b);
    }

    /**
     * Agora imagine que ja existe uma classe que tem a mesma assinatura de metodo (retorno e parametros iguais)
     */
    class CustomCalc {

        public int calculate(int a, int b, Calc calculator) {
            return calculator.execute(a, b);
        }
    }

    static int addition(final int a, final int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodReferences methodReferences = new MethodReferences();
        CustomCalc customCalc = methodReferences.new CustomCalc();

        /**
         * Criacao de uma operacao de adicao usando lambda
         */
        Calc addition = (a, b) -> a + b;
        customCalc.calculate(1, 1, addition);

        /**
         * Chamada direta passando como parametro o metodo de mesma assinatura ja existente
         */
        customCalc.calculate(1, 1, MethodReferences::addition);
    }

}
