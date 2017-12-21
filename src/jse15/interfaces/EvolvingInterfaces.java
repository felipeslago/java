package jse15.interfaces;

public class EvolvingInterfaces {

    /**
     * Imagine que a interface Calc foi criada a muito tempo e voc� deseja incluir mais um m�todo nela
     * O problema � que ela � utilizada por muitas classes e se voc� mud�-la, ser� necess�rio alterar todos essas classes
     * Para evitar esse trabalho, � poss�vel fazer com que uma interface extenda outra interface
     * Dessa forma, o programador poder� escolher qual das interfaces quer utilizar
     */

    interface Calc {

        void addition (int a, int b);
    }

    interface CalcPlus extends Calc {

        void subtraction (int a, int b);
    }

    class Calc1 implements Calc {

        @Override
        public void addition (final int a, final int b) {
            System.out.println("Valor da soma: " + (a + b));
        }
    }

    class Calc2 implements CalcPlus {

        @Override
        public void addition (final int a, final int b) {
            System.out.println("Valor da soma: " + (a + b));
        }

        @Override
        public void subtraction (final int a, final int b) {
            System.out.println("Valor da subtra��o: " + (a - b));
        }
    }

}
