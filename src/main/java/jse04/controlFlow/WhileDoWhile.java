package jse04.controlFlow;

public class WhileDoWhile {

    public static void main(String[] args) {

        /**
         * A declaracao while executa repetidamente ate que a condicao seja satisfeita
         */

        int i = 0;
        System.out.println("Valor de i: " + i);

        while (i < 10) { // Executa ate a condicao ser satisfeita
            i++;
            System.out.println("Valor de i: " + i);
        }

        /**
         * Ja a declaracao do...while executa primeiro e depois avalia se a condicao e verdadeira
         */

        System.out.println("--------------------------");

        System.out.println("Valor de i: " + i);

        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 10);
    }

}
