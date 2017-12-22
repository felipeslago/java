package jse18.numbers;

import static java.lang.Math.sqrt;

public class MathClass {

    public static void main (String[] args) {

        /**
         * A linguagem Java prov� a classe Math para auxiliar com opera��es matem�ticas atrav�s de m�todos est�ticos
         */

        double x = 5.5;
        long y = Math.round(x); // O m�todo round arredonda um n�mero ponto flutuante

        System.out.println(y);

        int z = -4;
        z = Math.abs(z); // O m�todo abs retorna o n�mero absoluto

        System.out.println(z);

        /**
         * Podemos simplificar a chamada desses m�todos est�ticos, evitando ter que escrever Math toda hora
         * Isso pode ser feito atrav�s do import est�tico 'import static'
         */

        double d = sqrt(z); // O m�todo sqrt retorna a raiz quadrada de um n�mero

        System.out.println(d);

        double sin = Math.sin(d); // O m�todo sin retorna o seno de um n�mero

        System.out.println(sin);

        double random = Math.random(); // O m�todo random retorna um n�mero rand�mico

        System.out.println(random);
    }

}
