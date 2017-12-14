package jse11.lambdaExpressions;

public class Syntax {

    class Person {

        int age;

        public int getAge () {
            return age;
        }

        public void setAge (final int age) {
            this.age = age;
        }
    }

    interface Check {

        boolean test (Person p);
    }

    interface Printer {

        void print (int a, int b);
    }

    public static void main (String[] args) {

        /**
         * A sintaxe de uma expressão lambda é composta por:
         * 1. Uma lista dos parâmetros de entrada do método (no caso de método com um parâmetro só, os parenteses não são necessários e o tipo dos parâmetros também não precisa ser declarado)
         * 2. O símbolo de flexa (->)
         * 3. Um corpo, que consiste em uma única expressão ou um bloco ({}) com várias declarações
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

        System.out.println("John é maior de idade: " + major.test(john));
        System.out.println("John é menor de idade: " + minor.test(john));
        printer.print(5, 5);
    }

    /**
     * IMPORTANTE: Assim como classes aninhadas, a serialização de expressões lambda é extremamente não recomendada.
     */
}
