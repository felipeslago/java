package jse11.lambdaExpressions;

public class Syntax {

    class Person {

        int age;

        public int getAge() {
            return age;
        }

        public void setAge(final int age) {
            this.age = age;
        }
    }

    interface Check {

        boolean test(Person p);
    }

    interface Printer {

        void print(int a, int b);
    }

    public static void main(String[] args) {

        /**
         * A sintaxe de uma expressao lambda e composta por: 1. Uma lista dos parametros de entrada do metodo (no caso
         * de metodo com um parametro so, os parenteses nao sao necessarios e o tipo dos parametros tambem nao precisa
         * ser declarado) 2. O simbolo de flexa (->) 3. Um corpo, que consiste em uma unica expressao ou um bloco ({})
         * com varias declaracoes
         */

        Check major = p -> p.getAge() > 18;

        Check minor = p -> {
            if (p.getAge() < 18)
                return true;
            else {
                return false;
            }
        };

        Printer printer = (a, b) -> System.out.println(a + b);

        Syntax syntax = new Syntax();
        Person john = syntax.new Person();
        john.setAge(10);

        System.out.println("John e maior de idade: " + major.test(john));
        System.out.println("John e menor de idade: " + minor.test(john));
        printer.print(5, 5);
    }

    /**
     * IMPORTANTE: Assim como classes aninhadas, a serializacao de expressoes lambda e extremamente nao recomendada.
     */
}
