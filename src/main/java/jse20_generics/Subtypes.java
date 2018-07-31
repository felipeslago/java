package jse20_generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Subtypes {

    /**
     * Um erro bastante comum ao comecar a trablhar com generics e confundir os subtipos
     *
     * A classe _Numbers aceita um tipo generico, enquanto o metodo doWork aceita a classe _Numbers do tipo _Number
     *
     * Porem, isso nao significa que podemos passar qualquer descendente de number, podemos utilizar somente number
     */

    class Numbers<T> {
    }

    static void sum(Numbers<java.lang.Number> numbers) {
    }

    public void execute() {
        Numbers<java.lang.Number> numberNumbers = new Numbers<>();
        sum(numberNumbers);

        Numbers<Double> doubleNumbers = new Numbers<>();
        // doWork(doubleNumbers); // nao compila
    }

    /**
     * Para esse exemplo funcionar, sera necessario que o tipo permaneca o mesmo e a classe tipada podera ser diferente
     */

    static void print(Collection<String> collection) {
        for (String s : collection) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Subtypes subtypes = new Subtypes();
        subtypes.execute();

        /**
         * As classes List e ArrayList sao descendentes de Collection
         */

        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("F");

        print(stringList);
    }

}
