package jse12.methodReferences;

import java.util.Arrays;
import java.util.function.Function;

public class ReferenceKinds {

    interface Calc {

        Integer execute(int a, int b);
    }

    static Integer addition(final int a, final int b) {
        return a + b;
    }

    Integer subtraction(final int a, final int b) {
        return a - b;
    }

    Integer execute(int a, int b, Calc operation) {
        return operation.execute(a, b);
    }

    public static void main(String[] args) {

        /**
         * e possivel utilizar os Method References de 4 maneiras:
         */

        ReferenceKinds referenceKinds = new ReferenceKinds();

        /**
         * Atraves da referencia estatica -> NomeDaClasse::metodoEstatico
         */

        Integer addition = referenceKinds.execute(1, 1, ReferenceKinds::addition);
        System.out.println("Resultado da adicao: " + addition);

        /**
         * Atraves de uma referencia de uma instancia -> nomeDaInstancia::metodo
         */

        Integer subtraction = referenceKinds.execute(2, 1, referenceKinds::subtraction);
        System.out.println("Resultado da subtracao: " + subtraction);

        /**
         * Atraves do uso de um construtor -> NomeDaClasse::new
         */

        Function<String, Integer> teste = Integer::new;
        Integer integer = teste.apply("10");
        System.out.println("Valor do inteiro criado: " + integer);

        /**
         * Atraves do uso em um objeto arbitrario (multiplos valores)
         */

        String[] arr = { "A", "B", "C" };
        Arrays.sort(arr, String::compareToIgnoreCase);

    }

}
