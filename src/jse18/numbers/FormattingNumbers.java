package jse18.numbers;

import java.text.DecimalFormat;

public class FormattingNumbers {

    public static void main (String[] args) {

        /**
         * Através do método System.out.format é possível formatar um texto de saída no console, sem a necessidade de ficar concatenando informação
         */

        Integer num1 = 10;
        Double num2 = 20.0;
        String description = "Valor";

        /**
         * Saída no console usando println e concatenando informações
         * Concatenar informações com o uso do operador + deixa o método muito confuso e muito suscetível a erros durante alterações
         */

        System.out.println(description + " inteiro: " + num1 + ", " + description + " double: " + num2);

        /**
         * O método format facilita a visualização das informações e recebe as informações a serem exibidas como se fossem parâmetros
         * Para especificar que um parâmetro será utilizado, basta usar o símbolo % precedido do operador necessário
         * Por exemplo, para Strings é utilizado o conversor 's', para inteiros o 'd', para pontos flutuantes o 'f' e etc.
         */

        System.out.format("%s inteiro: %d, %s double: %f", description, num1, description, num2);

        /**
         * Também é possível formatar o valor exibindo mais ou menos zeros e/ou casas decimais
         * O %n é utilizado para pular uma linha
         */

        System.out.format("%nValor inteiro formatado: %08d",
                num1); // %08d especifica que o número terá 8 posições com zeros a esquerda

        System.out.format("%nValor double formatado: %.2f%n",
                num2.doubleValue()); // %.2f especifica que o número terá 2 casas decimais após a vírgula (ou ponto)

        /**
         * A classe DecimalFormat também auxilia na formatação de números
         * Porém, ao invés de conversores, utilizar patterns de formatação
         */

        String pattern = "###.00"; // O pattern é bem simples de entender, sendo # um dígito opcional e 0 um dígito obrigatório

        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        System.out.println("Decimal format: " + decimalFormat.format(num2));
    }

}
