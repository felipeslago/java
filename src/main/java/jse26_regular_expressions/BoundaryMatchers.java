package jse26_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BoundaryMatchers {

    /**
     * Atraves dos matchers de limite ou fronteira, podemos validar que determinado conjunto esteja em determinada
     * posicao de uma String
     */

    public static void main(String[] args) {

        /**
         * O caracter ^ busca por um conjunto no comeco de uma String
         */
        execute("^a", "abc");

        /**
         * O caracter $ busca por um conjunto no final de uma String
         */
        execute("$a", "bca");

        /**
         * O conjunto \b busca por uma palavra inteira, ou seja, se dog estiver sozinho sera encontrado, porem se
         * estiver junto de outra palavra, como dogdog, nao sera encontrado
         */
        execute("\\bdog\\b", "The dog is mine");

        /**
         * O conjunto \B busca por uma palavra inteira mesmo que esteja junto de outro palavra
         */
        execute("\\Bdog\\B", "dogdog");

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
