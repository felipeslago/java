package jse26_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapturingGroups {

    /**
     * Ao contrario do uso de classes de caracteres, os grupos de captura sao utilizado para verificar pedacos de texto,
     * ou seja, utilizando o Pattern [abc] teremos um match do que tiver a, b ou c independente da ordem, porem
     * utilizando (abc) teremos o match exato do texto abc
     */

    public static void main(String[] args) {
        /**
         * No caso abaixo, teremos uma busca por abc, independete da ordem das letras, a cada 3 caracteres
         */
        execute("[abc]{3}", "abcbaccab");

        /**
         * No caso abaixo, teremos uma busca exata por abc a cada 3 caracteres
         */
        execute("(abc){3}", "abcabcabcabcabcabc");
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
