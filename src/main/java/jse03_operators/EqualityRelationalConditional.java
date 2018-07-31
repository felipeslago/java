package jse03_operators;

public class EqualityRelationalConditional {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        /**
         * Os operadores de igualdade e relacional determinam se um operador e maior que, menor que, igual ou diferente
         * de outro operador
         *
         * Operador: Descricao: --------- ----------------- == Igual a != Diferente de > Maior que >= Maior igual que <
         * Menor que <= Menor igual que
         */

        int a = 10;
        int b = 5;
        boolean result;

        /**
         * Esses operadores devolvem um valor true ou false dependendo do teste executado
         */

        result = a == b; // Os operadores = e == sao diferentes e executam funcoes diferentes
        System.out.println("Operador de igualdade a == b: " + result);

        result = a != b;
        System.out.println("Operador de diferenca a != b: " + result);

        result = a > b;
        System.out.println("Operador de maior que a > b: " + result);

        result = a >= b;
        System.out.println("Operador de maior ou igual que a >= b: " + result);

        result = a < b;
        System.out.println("Operador de menor que a < b: " + result);

        result = a <= b;
        System.out.println("Operador de menor ou igual que a <= b: " + result);

        System.out.println("----------------------");

        /**
         * Os operadores condicionais auxiliam a determinar se mais de um teste executado e verdadeiro ou falso
         *
         * Operador: Descricao: --------- ----------------- && Condicional E || Condicional Ou
         */

        /**
         * O operador && determina se todos os resultados da expressao sao verdadeiros
         */

        result = true && true;
        System.out.println("Operador condicional &&: " + result);

        result = false && true;
        System.out.println("Operador condicional &&: " + result);

        result = false && false;
        System.out.println("Operador condicional &&: " + result);

        /**
         * O operador || determina se pelo menos um dos resultados da expressao e verdadeiro
         */

        result = true || true;
        System.out.println("Operador condicional ||: " + result);

        result = false || true;
        System.out.println("Operador condicional ||: " + result);

        result = false || false;
        System.out.println("Operador condicional ||: " + result);
    }

}
