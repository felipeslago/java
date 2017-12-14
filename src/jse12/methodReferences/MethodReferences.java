package jse12.methodReferences;

public class MethodReferences {

    /**
     * As express�es lambdas s�o utilizadas para criar m�todos an�nimos, por�m muitas a express�o apenas chamam um m�todo j� existente
     * Nesse caso, o uso de Method References pode facilitar essas chamadas de uma maneira compacta e f�cil de entender
     */

    /**
     * Imagine a interface de uma calculadora que realiza uma opera��o com dois n�meros (int a, int b)
     */
    interface Calc {

        int execute (int a, int b);
    }

    /**
     * Agora imagine que j� existe uma classe que tem a mesma assinatura de m�todo (retorno e par�metros iguais)
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
         * Cria��o de uma opera��o de adi��o usando lambda
         */
        Calc addition = (a, b) -> a + b;
        customCalc.calculate(1, 1, addition);

        /**
         * Chamada direta passando como par�metro o m�todo de mesma assinatura j� existente
         */
        customCalc.calculate(1, 1, MethodReferences::addition);
    }

}
