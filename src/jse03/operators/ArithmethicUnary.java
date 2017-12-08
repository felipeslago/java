package jse03.operators;

public class ArithmethicUnary {

    public static void main (String[] args) {

        int x = 10;
        int y = 10;

        /**
         * Para realizar operações matemáticas, são utilizados os operadores abaixo
         *
         * Operador:  Descrição:
         * --------- ------------------
         * +	      Soma
         * -		  Subtração
         * *		  Multiplicação
         * /	      Divisão
         * %	      Resto da divisão
         */

        x = x + y;
        System.out.println("Soma de x + y: " + x);

        x = x - y;
        System.out.println("Substração de x - y: " + x);

        x = x * y;
        System.out.println("Multiplicação de x * y: " + x);

        x = x / y;
        System.out.println("Divisão de x / y: " + x);

        x = x % y;
        System.out.println("Resto da divisão de x / y: " + x);

        /**
         * Os operadores unários facilitam algumas tarefas, conforme abaixo:
         *
         * Operador:  Descrição:
         * --------- ----------------------
         * +		  Valores positivos
         * -		  Valores negativos
         * ++	      Soma
         * --		  Subtração
         * !		  Inversão de booleano
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
         * Quando os operadores ++ e -- são colocados antes da variável, o valor da variável é incrementado primeiro e depois atribuído
         * Quando os operadores são colocados depois da variável, primeiro o valor é atribuído e depois a variável é incrementada
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
         * Os operadores + e - podem definir valores positivos ou negativos em uma varíavel
         * O valor + é sempre assumido como default, quando nenhum operador é especificado
         */

        int z = 10;
        System.out.println("Operador + usado como default para z: " + z);

        z = -10;
        System.out.println("Operador - usado para alterar o valor de z: " + z);

        z = +10;
        System.out.println("Operador + usado para alterar o valor de z: " + z);

        /**
         * Quando trabalhamos com variáveis boleanas, podemos inverter o seu valor através do operador !
         */

        boolean bool = false;
        System.out.println("Valor de bool: " + bool);

        bool = !bool;
        System.out.println("Valor invertido de bool: " + bool);

    }

}
