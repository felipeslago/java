package jse01.variables;

public class Casting {

    public static void main(String[] args) {

        /**
         * e possivel atribuir uma variavel int em uma variavel double Porem nao e possivel atribuir uma variavel double
         * em uma variavel int Isso acontece, pois a variavel double possui uma parte decimal
         */

        int i = 10;
        double d;

        d = i;

        /**
         * Para fazer o inverso, sera necessario fazer o casting da variavel
         */

        i = (int) d;

        /**
         * Utilizando o cast (int) e atribuida somente a parte inteira do numero para a variavel int
         */

        System.out.println("int value: " + i);

    }
}
