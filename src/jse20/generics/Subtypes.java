package jse20.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import jsez22.Threads.Number;

public class Subtypes {

    /**
     * Um erro bastante comum ao come�ar a trablhar com generics � confundir os subtipos
     *
     * A classe Numbers aceita um tipo gen�rico, enquanto o m�todo sum aceita a classe Numbers do tipo Number
     *
     * Por�m, isso n�o significa que podemos passar qualquer descendente de number, podemos utilizar somente number
     */

    class Numbers<T> {
    }

    static void sum(Numbers<Number> numbers) {
    }

    public void execute() {
        Numbers<Number> numberNumbers = new Numbers<>();
        sum(numberNumbers);

        Numbers<Double> doubleNumbers = new Numbers<>();
        // sum(doubleNumbers); // n�o compila
    }

    /**
     * Para esse exemplo funcionar, ser� necess�rio que o tipo permane�a o mesmo e a classe tipada poder� ser diferente
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
         * As classes List e ArrayList s�o descendentes de Collection
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
