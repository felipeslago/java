package jse23.javaiIO;

public class Formatting {

    public static void main(String[] args) {

        /**
         * Os metodos print, println e format sao utilizado para imprimir dados no console do usuario, com as seguintes
         * diferencas
         *
         * print - imprime valores individualmente (sem quebra de linha)
         *
         * println - imprime valores individualmente (com quebra de linha no final)
         *
         * format - imprime uma sequencia de valores ja formatados de acordo com o tipo de dado especificado
         *
         * Os tipos de dados especificos sao: %d (formata um inteiro), %f (formata um ponto flutuante), %n (quebra de
         * linha), %x (formata inteiro como hexadecimal) e %s(formata qualquer valor como string)
         */

        int i = 2;
        double r = Math.sqrt(i);

        System.out.print("A raiz quadrada de ");
        System.out.print(i);
        System.out.print(" eh ");
        System.out.print(r);
        System.out.print("\n");

        System.out.println("A raiz quadrada de " + i + " eh " + r);

        System.out.format("A raiz quadrada de %d eh %f", i, r);
    }

}
