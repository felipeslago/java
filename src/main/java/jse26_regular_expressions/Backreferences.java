package jse26_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Backreferences {

    /**
     * Podemos utilizar uma referencia do que ja foi encontrado pelo matcher de grupos de captura, que sao salvos na
     * memoria uma chamada posterior, para validar se ela se repete no decorrer da String
     */

    public static void main(String[] args) {
        /**
         * No caso abaixo, buscamos pelo grupo de captura de dois digitos (\d\d) e depois verificar se esses dois
         * digitos se repetem 1 vez (\1)
         */
        execute("(\\d\\d)\\1", "1212"); // Buscamos por dois digitos, no caso 12 e eles se repetem
        execute("(\\d\\d)\\1", "1234"); // Nao ocorrera o match, pois 12 nao se repete
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
