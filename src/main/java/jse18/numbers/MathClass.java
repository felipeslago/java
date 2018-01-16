package jse18.numbers;

import static java.lang.Math.sqrt;

public class MathClass {

    public static void main(String[] args) {

        /**
         * A linguagem Java prove a classe Math para auxiliar com operacoes matematicas atraves de metodos estaticos
         */

        double x = 5.5;
        long y = Math.round(x); // O metodo round arredonda um numero ponto flutuante

        System.out.println(y);

        int z = -4;
        z = Math.abs(z); // O metodo abs retorna o numero absoluto

        System.out.println(z);

        /**
         * Podemos simplificar a chamada desses metodos estaticos, evitando ter que escrever Math toda hora Isso pode
         * ser feito atraves do import estatico 'import static'
         */

        double d = sqrt(z); // O metodo sqrt retorna a raiz quadrada de um numero

        System.out.println(d);

        double sin = Math.sin(d); // O metodo sin retorna o seno de um numero

        System.out.println(sin);

        double random = Math.random(); // O metodo random retorna um numero randomico

        System.out.println(random);
    }

}
