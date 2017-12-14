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
         * A sintaxe de uma express�o lambda � composta por:
         * 1. Uma lista dos par�metros de entrada do m�todo (no caso de m�todo com um par�metro s�, os parenteses n�o s�o necess�rios e o tipo dos par�metros tamb�m n�o precisa ser declarado)
         * 2. O s�mbolo de flexa (->)
         * 3. Um corpo, que consiste em uma �nica express�o ou um bloco ({}) com v�rias declara��es
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

        System.out.println("John � maior de idade: " + major.test(john));
        System.out.println("John � menor de idade: " + minor.test(john));
        printer.print(5, 5);
    }

    /**
     * IMPORTANTE: Assim como classes aninhadas, a serializa��o de express�es lambda � extremamente n�o recomendada.
     */
}
