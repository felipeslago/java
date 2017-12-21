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
         * É possível utilizar os Method References de 4 maneiras:
         */

        ReferenceKinds referenceKinds = new ReferenceKinds();

        /**
         * Através da referência estática -> NomeDaClasse::métodoEstático
         */

        Integer addition = referenceKinds.execute(1, 1, ReferenceKinds::addition);
        System.out.println("Resultado da adição: " + addition);

        /**
         * Através de uma referência de uma instância -> nomeDaInstancia::método
         */

        Integer subtraction = referenceKinds.execute(2, 1, referenceKinds::subtraction);
        System.out.println("Resultado da subtração: " + subtraction);

        /**
         * Através do uso de um construtor -> NomeDaClasse::new
         */

        Function<String, Integer> teste = Integer::new;
        Integer integer = teste.apply("10");
        System.out.println("Valor do inteiro criado: " + integer);

        /**
         * Através do uso em um objeto arbitrário (multiplos valores)
         */

        String[] arr = { "A", "B", "C" };
        Arrays.sort(arr, String::compareToIgnoreCase);

    }

}
