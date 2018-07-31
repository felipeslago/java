package z.z21_DominatingCollections;

import java.util.ArrayList;
import java.util.List;

public class EqualsMethod {

    public static void main(String[] args) {

        // The equals method compares the object reference

        List<Person> people = new ArrayList<>();

        // Even if the data inside these two objects are equal it will not have the same reference and will be different

        Person p1 = new Person("Carl", 20);
        Person p2 = new Person("Carl", 20);

        people.add(p1);

        // The method contains uses the equals method to search an equal object inside the array
        // By rewriting the equals method in the Person class is possible to change the comparison

        System.out.println(people.contains(p2));
    }

}
