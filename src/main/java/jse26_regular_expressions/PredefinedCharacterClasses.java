package jse26_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedCharacterClasses {

    /**
     * As Classes de Caracteres Predefinidas foram criadas para facilitar o uso de Expressoes Regulares, ou seja, foram
     * criados atalhos para os Patterns mais utilizados
     *
     * IMPORTANTE: o caracter \ eh utilizada como escape, ou seja, existem caracteres que sao reservados e de uso
     * exclusivo das expressoes regulares, chamados de Metacharacters, porem caso seja necessario utilizar esses
     * caracteres, devem ser precedidos de \
     */

    public static void main(String[] args) {

        /**
         * O caracter . busca por qualquer caracter, ou seja, qualquer coisa sera encontrada
         */
        execute(".", "a");

        /**
         * O conjunto \d busca por qualquer caracter que seja um numero, atalho para [0-9]
         */
        execute("\\d", "a2"); // utilizamos \\ por conta do \ ser um caracter de escape

        /**
         * O conjunto \D busca por qualquer caracter que NAO seja um numero, atalho para [^0-9]
         */
        execute("\\D", "a2"); // utilizamos \\ por conta do \ ser um caracter de escape

        /**
         * O conjunto \s busca por qualquer caracter que seja um espaco em branco, atalho para [ \t\n\x0B\f\r]
         */
        execute("\\s", "a a"); // utilizamos \\ por conta do \ ser um caracter de escape

        /**
         * O conjunto \S busca por qualquer caracter que NAO seja um espaco em branco, atalho para [^\s]
         */
        execute("\\S", " a"); // utilizamos \\ por conta do \ ser um caracter de escape

        /**
         * O conjunto \w busca por qualquer caracter que seja uma letra ou numero, atalho para [a-zA-Z_0-9]
         */
        execute("\\w", "@f"); // utilizamos \\ por conta do \ ser um caracter de escape

        /**
         * O conjunto \W busca por qualquer caracter que NAO seja uma letra ou numero, atalho para [^w]
         */
        execute("\\W", "@f"); // utilizamos \\ por conta do \ ser um caracter de escape

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
