package jse03.operators;

public class TypeComparisonOperator {

    public static void main(String[] args) {

        /**
         * O operador instanceof compara se um objeto e de um tipo especifico Com ele e possivel testar se um objeto e
         * uma instancia de determinada classe, subclasse, ou uma instancia de classe que immplemente uma interface
         */

        Double value = 2.0;
        Object obj = value;

        System.out.println("obj e instancia de Integer: " + (obj instanceof Integer));

        System.out.println("obj e instancia de Double: " + (obj instanceof Double));

        System.out.println("obj e extende de _Number: " + (obj instanceof Number));

        System.out.println("obj e implementa Comparable: " + (obj instanceof Comparable));

    }

}
