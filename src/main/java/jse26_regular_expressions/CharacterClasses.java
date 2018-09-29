package jse26_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClasses {

    /**
     * Classes de Caracteres sao utilizadas para especificar um conjunto de caracteres a serem validados em uma String,
     * esses caracteres devem ser especificados dentro de []
     *
     * Eh como se fossem possibilidades existentes para um determinado texto
     *
     * Essas classes estao divididas em Simples, Negacao, Ranges, Uniao, Intersecao e Subtracao
     */

    public static void main(String[] args) {

        /**
         * No exemplo abaixo , classe simples, o match soh ira acontecer se a palavra 'at' for precedida de algum
         * caracter do conjunto 'b,c,r', como cat, bat ou rat
         */

        execute("[bcr]at", "cat");
        execute("[bcr]at", "bat");
        execute("[bcr]at", "rat");

        /**
         * Neste caso, negacao, o caracter ^ indica uma negacao do conjunto 'b,c,r', entao apenas palavras 'at' nao
         * precedidas pelo conjunto darao o match
         */

        execute("[^bcr]at", "nat");
        execute("[^bcr]at", "fat");
        execute("[^bcr]at", "mat");

        /**
         * Neste caso, ranges, o caracter - indica que sao aceitos caracteres de um 1 a 5, precedidos pela palavra 'foo'
         *
         * Tambem eh possivel fazer o mesmo com letras, por exemplo a-z ou A-Z, lembrando que o Pattern eh case
         * sensitive
         */

        execute("foo[1-5]", "foo1");
        execute("foo[1-5]", "foo2");
        execute("foo[1-5]", "foo6"); // Esse match nao ira acontecer

        /**
         * Neste caso, uniao, definimos um range junto de outro, utilizando [] dentro de outro [], dessa forma serao
         * aceitos os caracteres de 0 a 4 e 6 a 8 precididos pela palavra 'foo'
         */

        execute("foo[0-4[6-8]]", "foo5"); // Esse match nao ira acontecer
        execute("foo[0-4[6-8]]", "foo6");
        execute("foo[0-4[6-8]]", "foo8");

        /**
         * Neste caso, intersecao, definimos elementos em comum entre dois conjuntos 0 a 9 e 4 a 5, neste caso serao
         * aceitos os caracteres 4 e 5 precedidos pela palavra 'foo'
         */

        execute("foo[0-9&&[4-5]]", "foo4");
        execute("foo[0-9&&[4-5]]", "foo5");
        execute("foo[0-9&&[4-5]]", "foo9"); // Esse match nao ira acontecer

        /**
         * Neste caso, subtracao, utilizamos em conjunto com a intersecao para remover os elementos do segundo conjunto
         * (4 a 5) do primeiro conjunto (0 a 9), dessa forma serao aceitos os caracteres de 0 a 3 e 6 a 9 precedidos
         * pelo texto 'foo'
         */

        execute("foo[0-9&&[^4-5]]", "foo1");
        execute("foo[0-9&&[^4-5]]", "foo2");
        execute("foo[0-9&&[^4-5]]", "foo5"); // Esse match nao ira acontecer
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
