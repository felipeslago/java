package jse26_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    /**
     * Expressoes regulares sao uma maneira de descrever um conjunto de strings, baseadas em caracteristicas comuns
     *
     * Podem ser utilizadas para realizar buscas, editar ou manipular dados, utilizando uma sintaxe especifica
     *
     * As principais classes utilizadas sao:
     *
     * Pattern: utilizada para representar uma expressao regular
     *
     * Matcher: utilizada para para interpretar a expressao regular e realizar as buscar de dados em uma determinada
     * string
     *
     * PatternSyntaxException: representa uma exception que indica um erro de sintaxe do Pattern utilizado
     */

    public static void main(String[] args) {
        // No exemplo abaixo, estamos procurando pelo Pattern 'cat' dentro da String 'cats'
        Pattern pattern = Pattern.compile("cat");

        Matcher matcher = pattern.matcher("cats");

        while (matcher.find()) {
            System.out.println(
                    String.format("Found the pattern '%s' starting at position %d", matcher.group(), matcher.start()));
        }
    }

}
