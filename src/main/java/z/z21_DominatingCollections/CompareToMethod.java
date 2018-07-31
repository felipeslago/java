package z.z21_DominatingCollections;

import java.util.ArrayList;
import java.util.Collections;

public class CompareToMethod {

    public static void main(String[] args) {

        Person p1 = new Person("John", 21);
        Person p2 = new Person("Carl", 25);
        Person p3 = new Person("Bob", 30);

        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        System.out.println(people);

        // To sort a new class is necessary to tell the Collections.sort method how to do this
        // It is possible by implementing the Comparable interface and rewriting the compareTo method

        Collections.sort(people);

        System.out.println(people);
    }

}
