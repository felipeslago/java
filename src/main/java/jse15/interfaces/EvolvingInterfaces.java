package jse15.interfaces;

public class EvolvingInterfaces {

    /**
     * Imagine que a interface Calc foi criada a muito tempo e voce deseja incluir mais um metodo nela O problema e que
     * ela e utilizada por muitas classes e se voce muda-la, sera necessario alterar todos essas classes Para evitar
     * esse trabalho, e possivel fazer com que uma interface extenda outra interface Dessa forma, o programador podera
     * escolher qual das interfaces quer utilizar
     */

    interface Calc {

        void addition(int a, int b);
    }

    interface CalcPlus extends Calc {

        void subtraction(int a, int b);
    }

    class Calc1 implements Calc {

        @Override
        public void addition(final int a, final int b) {
            System.out.println("Valor da soma: " + (a + b));
        }
    }

    class Calc2 implements CalcPlus {

        @Override
        public void addition(final int a, final int b) {
            System.out.println("Valor da soma: " + (a + b));
        }

        @Override
        public void subtraction(final int a, final int b) {
            System.out.println("Valor da subtracao: " + (a - b));
        }
    }

}
