package z.z20_CollectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

    public static void main(String[] args) {

        // The Set class has three principal implementations: HashSet, LinkedHashSet and TreeSet
        // It has an incomparable performance in search than the List class
        // But it not permits duplicated items

        // The HashSet is the faster class
        // But it not saves the insertion order, it has its own order
        // This class must be used if the program needs speed without carrying about insertion order

        Set<String> people = new HashSet<>();

        people.add("John");
        people.add("Carl");
        people.add("Lily");
        people.add("John"); // This item will not be added to the Set

        System.out.println(people);

        // The TreeSet class sort automatically the added elements
        // Because of this, it is not so fast than the HashSet

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(50);
        numbers.add(5);

        System.out.println(numbers);

        // The LinkedHashSet is in the middle of speed and sorting
        // It has a speed little like HashSet and a sorting little like TreeSet
        // The elements continued with the insertion order

        Set<Double> floats = new LinkedHashSet<>();

        floats.add(10.9);
        floats.add(10.5);
        floats.add(10.1);
        floats.add(10.2);

        System.out.println(floats);
    }

}
