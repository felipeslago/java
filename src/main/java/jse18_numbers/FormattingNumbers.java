package jse18_numbers;

import java.text.DecimalFormat;

public class FormattingNumbers {

    public static void main(String[] args) {

        /**
         * Atraves do metodo System.out.format e possivel formatar um texto de saida no console, sem a necessidade de
         * ficar concatenando informacao
         */

        Integer num1 = 10;
        Double num2 = 20.0;
        String description = "Valor";

        /**
         * Saida no console usando println e concatenando informacoes Concatenar informacoes com o uso do operador +
         * deixa o metodo muito confuso e muito suscetivel a erros durante alteracoes
         */

        System.out.println(description + " inteiro: " + num1 + ", " + description + " double: " + num2);

        /**
         * O metodo format facilita a visualizacao das informacoes e recebe as informacoes a serem exibidas como se
         * fossem parametros Para especificar que um parametro sera utilizado, basta usar o simbolo % precedido do
         * operador necessario Por exemplo, para Strings e utilizado o conversor 's', para inteiros o 'd', para pontos
         * flutuantes o 'f' e etc.
         */

        System.out.format("%s inteiro: %d, %s double: %f", description, num1, description, num2);

        /**
         * Tambem e possivel formatar o valor exibindo mais ou menos zeros e/ou casas decimais O %n e utilizado para
         * pular uma linha
         */

        System.out.format("%nValor inteiro formatado: %08d", num1); // %08d especifica que o numero tera 8 posicoes com
                                                                    // zeros a esquerda

        System.out.format("%nValor double formatado: %.2f%n", num2.doubleValue()); // %.2f especifica que o numero tera
                                                                                   // 2 casas decimais apos a virgula
                                                                                   // (ou ponto)

        /**
         * A classe DecimalFormat tambem auxilia na formatacao de numeros Porem, ao inves de conversores, utilizar
         * patterns de formatacao
         */

        String pattern = "###.00"; // O pattern e bem simples de entender, sendo # um digito opcional e 0 um digito
                                   // obrigatorio

        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        System.out.println("Decimal format: " + decimalFormat.format(num2));
    }

}
