package jse12.methodReferences;

import java.util.Arrays;
import java.util.function.Function;

public class ReferenceKinds {

    interface Calc {

        Integer execute (int a, int b);
    }

    static Integer addition (final int a, final int b) {
        return a + b;
    }

    Integer subtraction (final int a, final int b) {
        return a - b;
    }

    Integer execute (int a, int b, Calc operation) {
        return operation.execute(a, b);
    }

    public static void main (String[] args) {

        /**
         * � poss�vel utilizar os Method References de 4 maneiras:
         */

        ReferenceKinds referenceKinds = new ReferenceKinds();

        /**
         * Atrav�s da refer�ncia est�tica -> NomeDaClasse::m�todoEst�tico
         */

        Integer addition = referenceKinds.execute(1, 1, ReferenceKinds::addition);
        System.out.println("Resultado da adi��o: " + addition);

        /**
         * Atrav�s de uma refer�ncia de uma inst�ncia -> nomeDaInstancia::m�todo
         */

        Integer subtraction = referenceKinds.execute(2, 1, referenceKinds::subtraction);
        System.out.println("Resultado da subtra��o: " + subtraction);

        /**
         * Atrav�s do uso de um construtor -> NomeDaClasse::new
         */

        Function<String, Integer> teste = Integer::new;
        Integer integer = teste.apply("10");
        System.out.println("Valor do inteiro criado: " + integer);

        /**
         * Atrav�s do uso em um objeto arbitr�rio (multiplos valores)
         */

        String[] arr = { "A", "B", "C" };
        Arrays.sort(arr, String::compareToIgnoreCase);

    }

}
