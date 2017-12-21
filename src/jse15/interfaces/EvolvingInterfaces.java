package jse15.interfaces;

public class EvolvingInterfaces {

    /**
     * Imagine que a interface Calc foi criada a muito tempo e você deseja incluir mais um método nela
     * O problema é que ela é utilizada por muitas classes e se você mudá-la, será necessário alterar todos essas classes
     * Para evitar esse trabalho, é possível fazer com que uma interface extenda outra interface
     * Dessa forma, o programador poderá escolher qual das interfaces quer utilizar
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
            System.out.println("Valor da subtração: " + (a - b));
        }
    }

}
