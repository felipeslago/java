package jse18.numbers;

import java.text.DecimalFormat;

public class FormattingNumbers {

    public static void main (String[] args) {

        /**
         * Atrav�s do m�todo System.out.format � poss�vel formatar um texto de sa�da no console, sem a necessidade de ficar concatenando informa��o
         */

        Integer num1 = 10;
        Double num2 = 20.0;
        String description = "Valor";

        /**
         * Sa�da no console usando println e concatenando informa��es
         * Concatenar informa��es com o uso do operador + deixa o m�todo muito confuso e muito suscet�vel a erros durante altera��es
         */

        System.out.println(description + " inteiro: " + num1 + ", " + description + " double: " + num2);

        /**
         * O m�todo format facilita a visualiza��o das informa��es e recebe as informa��es a serem exibidas como se fossem par�metros
         * Para especificar que um par�metro ser� utilizado, basta usar o s�mbolo % precedido do operador necess�rio
         * Por exemplo, para Strings � utilizado o conversor 's', para inteiros o 'd', para pontos flutuantes o 'f' e etc.
         */

        System.out.format("%s inteiro: %d, %s double: %f", description, num1, description, num2);

        /**
         * Tamb�m � poss�vel formatar o valor exibindo mais ou menos zeros e/ou casas decimais
         * O %n � utilizado para pular uma linha
         */

        System.out.format("%nValor inteiro formatado: %08d",
                num1); // %08d especifica que o n�mero ter� 8 posi��es com zeros a esquerda

        System.out.format("%nValor double formatado: %.2f%n",
                num2.doubleValue()); // %.2f especifica que o n�mero ter� 2 casas decimais ap�s a v�rgula (ou ponto)

        /**
         * A classe DecimalFormat tamb�m auxilia na formata��o de n�meros
         * Por�m, ao inv�s de conversores, utilizar patterns de formata��o
         */

        String pattern = "###.00"; // O pattern � bem simples de entender, sendo # um d�gito opcional e 0 um d�gito obrigat�rio

        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        System.out.println("Decimal format: " + decimalFormat.format(num2));
    }

}
