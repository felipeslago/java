package jse03.operators;

public class ArithmethicUnary {

    public static void main (String[] args) {

        int x = 10;
        int y = 10;

        /**
         * Para realizar opera��es matem�ticas, s�o utilizados os operadores abaixo
         *
         * Operador:  Descri��o:
         * --------- ------------------
         * +	      Soma
         * -		  Subtra��o
         * *		  Multiplica��o
         * /	      Divis�o
         * %	      Resto da divis�o
         */

        x = x + y;
        System.out.println("Soma de x + y: " + x);

        x = x - y;
        System.out.println("Substra��o de x - y: " + x);

        x = x * y;
        System.out.println("Multiplica��o de x * y: " + x);

        x = x / y;
        System.out.println("Divis�o de x / y: " + x);

        x = x % y;
        System.out.println("Resto da divis�o de x / y: " + x);

        /**
         * Os operadores un�rios facilitam algumas tarefas, conforme abaixo:
         *
         * Operador:  Descri��o:
         * --------- ----------------------
         * +		  Valores positivos
         * -		  Valores negativos
         * ++	      Soma
         * --		  Subtra��o
         * !		  Invers�o de booleano
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
         * Quando os operadores ++ e -- s�o colocados antes da vari�vel, o valor da vari�vel � incrementado primeiro e depois atribu�do
         * Quando os operadores s�o colocados depois da vari�vel, primeiro o valor � atribu�do e depois a vari�vel � incrementada
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
         * Os operadores + e - podem definir valores positivos ou negativos em uma var�avel
         * O valor + � sempre assumido como default, quando nenhum operador � especificado
         */

        int z = 10;
        System.out.println("Operador + usado como default para z: " + z);

        z = -10;
        System.out.println("Operador - usado para alterar o valor de z: " + z);

        z = +10;
        System.out.println("Operador + usado para alterar o valor de z: " + z);

        /**
         * Quando trabalhamos com vari�veis boleanas, podemos inverter o seu valor atrav�s do operador !
         */

        boolean bool = false;
        System.out.println("Valor de bool: " + bool);

        bool = !bool;
        System.out.println("Valor invertido de bool: " + bool);

    }

}
