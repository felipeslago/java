package jse26_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {

    /**
     * Os quantificadores sao utilizado para quantificar a quantidade de ocorrencias em uma String, ou seja, validam
     * quantas vezes determinado conjunto deve ser encontrado ou nao
     */

    public static void main(String[] args) {
        /**
         * No caso abaixo, o caracter ? indica que o x deve aparecer uma ou nenhuma vez na literal 'x'
         *
         * Neste caso o matcher encontrara o proprio x e encontrara tambem o proximo caracter, que seja um espaco vazio
         *
         * Isso acontece, pois o matcher eh exclusivo, ou seja, o caracter x esta na posicao 0, porem logo apos ele
         * existe a posicao 1 que nao eh visivel, mas mesmo assim eh considerada
         */
        execute("x?", "x");

        /**
         * No caso abaixo, o caracter * indica que o x deve aparecer nenhuma ou mais vezez na literal 'x'
         */
        execute("x*", "x");

        /**
         * No caso abaixo, o caracter + indica que o x deve aparecer uma ou mais vezez na literal 'x', sendo assim, nao
         * encontra o caracter posterior, encontrado em ? e *
         */
        execute("x+", "x");

        /**
         * No caso abaixo, o conjunto {1} indica que o x deve aparecer exatamente 1 vez na literal 'x'
         */
        execute("x{1}", "x");

        /**
         * No caso abaixo, o conjunto {1,} indica que o x deve aparecer pelo menos 1 vez na literal 'x'
         */
        execute("x{1,}", "x");

        /**
         * No caso abaixo, o conjunto {1,1} indica que o x deve aparecer no minimo 1 e no maximo 1 vez na literal 'x'
         */
        execute("x{1,1}", "x");
    }

    private static void execute(String patternToApply, String literal) {
        Pattern pattern = Pattern.compile(patternToApply);

        Matcher matcher = pattern.matcher(literal);

        while (matcher.find()) {
            System.out.println(
                    String.format("Found the pattern '%s' starting at position %d", matcher.group(), matcher.start()));
        }
    }

}
