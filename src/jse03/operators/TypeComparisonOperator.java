package jse03.operators;

public class TypeComparisonOperator {

    public static void main (String[] args) {

        /**
         * O operador instanceof compara se um objeto é de um tipo específico
         * Com ele é possível testar se um objeto é uma instância de determinada classe, subclasse, ou uma instância de classe que immplemente uma interface
         */

        Double value = 2.0;
        Object obj = value;

        System.out.println("obj é instância de Integer: " + (obj instanceof Integer));

        System.out.println("obj é instância de Double: " + (obj instanceof Double));

        System.out.println("obj é extende de Number: " + (obj instanceof Number));

        System.out.println("obj é implementa Comparable: " + (obj instanceof Comparable));

    }

}
