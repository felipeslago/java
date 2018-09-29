package jse26_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLiterals {

    /**
     * O Pattern mais simples utilizado eh o texto literal, ou seja, procurar por um trecho de texto específico
     */

    public static void main(String[] args) {
        /**
         * No exemplo abaixo, estamos procurando pelo Pattern 'foo' dentro da String 'foofoofoo'
         *
         * Note que será retornado 3 vezes a palavra foo, pois ela existe 3 vezes dentro da String
         *
         * Sendo assim, podemos perceber que o Matcher executa sua busca por partes, ou seja, encontrou o primeiro
         * Pattern, porem a String ainda tinha mais texto, entao continuou procurando pelo mesmo Pattern ate chegar ao
         * final da String
         */
        Pattern pattern = Pattern.compile("foo");

        Matcher matcher = pattern.matcher("foofoofoo");

        while (matcher.find()) {
            System.out.println(
                    String.format("Found the pattern '%s' starting at position %d", matcher.group(), matcher.start()));
        }
    }

}
