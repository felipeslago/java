package jse20.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import jsez22.Threads.Number;

public class Subtypes {

    /**
     * Um erro bastante comum ao começar a trablhar com generics é confundir os subtipos
     *
     * A classe Numbers aceita um tipo genérico, enquanto o método sum aceita a classe Numbers do tipo Number
     *
     * Porém, isso não significa que podemos passar qualquer descendente de number, podemos utilizar somente number
     */

    class Numbers<T> {
    }

    static void sum(Numbers<Number> numbers) {
    }

    public void execute() {
        Numbers<Number> numberNumbers = new Numbers<>();
        sum(numberNumbers);

        Numbers<Double> doubleNumbers = new Numbers<>();
        // sum(doubleNumbers); // não compila
    }

    /**
     * Para esse exemplo funcionar, será necessário que o tipo permaneça o mesmo e a classe tipada poderá ser diferente
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
         * As classes List e ArrayList são descendentes de Collection
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
