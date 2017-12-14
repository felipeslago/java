package jse12.methodReferences;

import java.util.ArrayList;
import java.util.List;

public interface Calc {

    interface Print<T> {

        T getName ();
    }

    class Person implements Print<String> {

        String name = "John";

        @Override
        public String getName () {
            return name;
        }
    }

    static <Y> void printName (Print<Y> person) {
        System.out.println(person.getName());
    }

    public static void main (String[] args) {
        List<Person> roster = new ArrayList<>();
        printName(Person::new);
    }

}
