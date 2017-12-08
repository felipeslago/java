package jse03.operators;

public class TypeComparisonOperator {

    public static void main (String[] args) {

        /**
         * O operador instanceof compara se um objeto � de um tipo espec�fico
         * Com ele � poss�vel testar se um objeto � uma inst�ncia de determinada classe, subclasse, ou uma inst�ncia de classe que immplemente uma interface
         */

        Double value = 2.0;
        Object obj = value;

        System.out.println("obj � inst�ncia de Integer: " + (obj instanceof Integer));

        System.out.println("obj � inst�ncia de Double: " + (obj instanceof Double));

        System.out.println("obj � extende de Number: " + (obj instanceof Number));

        System.out.println("obj � implementa Comparable: " + (obj instanceof Comparable));

    }

}
