package jse18.numbers;

import static java.lang.Math.sqrt;

public class MathClass {

    public static void main (String[] args) {

        /**
         * A linguagem Java provê a classe Math para auxiliar com operações matemáticas através de métodos estáticos
         */

        double x = 5.5;
        long y = Math.round(x); // O método round arredonda um número ponto flutuante

        System.out.println(y);

        int z = -4;
        z = Math.abs(z); // O método abs retorna o número absoluto

        System.out.println(z);

        /**
         * Podemos simplificar a chamada desses métodos estáticos, evitando ter que escrever Math toda hora
         * Isso pode ser feito através do import estático 'import static'
         */

        double d = sqrt(z); // O método sqrt retorna a raiz quadrada de um número

        System.out.println(d);

        double sin = Math.sin(d); // O método sin retorna o seno de um número

        System.out.println(sin);

        double random = Math.random(); // O método random retorna um número randômico

        System.out.println(random);
    }

}
