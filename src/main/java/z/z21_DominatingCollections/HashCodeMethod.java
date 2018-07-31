package z.z21_DominatingCollections;

import java.util.HashSet;
import java.util.Set;

public class HashCodeMethod {

    public static void main(String[] args) {

        Set<Person> party = new HashSet<>();

        Person p1 = new Person("John", 21);
        Person p2 = new Person("Carl", 25);
        Person p3 = new Person("Bob", 30);
        Person p4 = new Person("Lily", 18);

        party.add(p1);
        party.add(p2);
        party.add(p3);
        party.add(p4);

        // Even changing the equals method to compare two person by the name, it will not work for the Set class
        // Ever that a object is added to a Set, it receives a number called HashCode
        // The HashCode is a mathematical calculation based on the object
        // Every object that has the same HashCode is grouped together
        // So to make searches faster, the Set just search in a specific group of HashCodes
        // But by default the HashCode is generated based on the object, not on a specific property
        // Rewriting the HashCode method in the Person class will change the grouping

        Person John = new Person("John", 21);

        System.out.println(party.contains(John));
    }

}
