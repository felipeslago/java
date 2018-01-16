package jse03.operators;

public class ArithmethicUnary {

    public static void main(String[] args) {

        int x = 10;
        int y = 10;

        /**
         * Para realizar operacoes matematicas, sao utilizados os operadores abaixo
         *
         * Operador: Descricao: --------- ------------------ + Soma - Subtracao * Multiplicacao / Divisao % Resto da
         * divisao
         */

        x = x + y;
        System.out.println("Soma de x + y: " + x);

        x = x - y;
        System.out.println("Substracao de x - y: " + x);

        x = x * y;
        System.out.println("Multiplicacao de x * y: " + x);

        x = x / y;
        System.out.println("Divisao de x / y: " + x);

        x = x % y;
        System.out.println("Resto da divisao de x / y: " + x);

        /**
         * Os operadores unarios facilitam algumas tarefas, conforme abaixo:
         *
         * Operador: Descricao: --------- ---------------------- + Valores positivos - Valores negativos ++ Soma --
         * Subtracao ! Inversao de booleano
         */

        System.out.println("--------------------------");

        System.out.println("Valor de x: " + x);

        x = x + 1; // Somar 1 em x pode ser feito assim
        System.out.println("Valor de x + 1: " + x);

        x++; // Ou de uma maneira mais simples como esta
        System.out.println("Valor de x++: " + x);

        System.out.println("Valor de x: " + x);

        x = x - 1; // Subtrair 1 de x pode ser feito assim
        System.out.println("Valor de x - 1: " + x);

        x--; // Ou de uma maneira mais simples como esta
        System.out.println("Valor de x--: " + x);

        /**
         * Quando os operadores ++ e -- sao colocados antes da variavel, o valor da variavel e incrementado primeiro e
         * depois atribuido Quando os operadores sao colocados depois da variavel, primeiro o valor e atribuido e depois
         * a variavel e incrementada
         */

        System.out.println("--------------------------");

        int v = 0;
        System.out.println("Valor de v: " + v);
        System.out.println("Valor de x: " + x);

        v = x++;
        System.out.println("Valor de v: " + v);
        System.out.println("Valor de x: " + x);

        v = ++x;
        System.out.println("Valor de v: " + v);
        System.out.println("Valor de x: " + x);

        System.out.println("--------------------------");

        /**
         * Os operadores + e - podem definir valores positivos ou negativos em uma variavel O valor + e sempre assumido
         * como default, quando nenhum operador e especificado
         */

        int z = 10;
        System.out.println("Operador + usado como default para z: " + z);

        z = -10;
        System.out.println("Operador - usado para alterar o valor de z: " + z);

        z = +10;
        System.out.println("Operador + usado para alterar o valor de z: " + z);

        /**
         * Quando trabalhamos com variaveis boleanas, podemos inverter o seu valor atraves do operador !
         */

        boolean bool = false;
        System.out.println("Valor de bool: " + bool);

        bool = !bool;
        System.out.println("Valor invertido de bool: " + bool);

    }

}
