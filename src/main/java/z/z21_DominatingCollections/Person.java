package z.z21_DominatingCollections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Person implements Comparable<Person> {

    String name;
    int age;
    List<Friend> friends = new LinkedList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public List<Friend> getFriends() {
        return Collections.unmodifiableList(this.friends);
    }

    public void add(Friend friend) {
        this.friends.add(friend);
    }

    public List<Friend> getFriendsUnmodifiable() {
        return Collections.unmodifiableList(this.friends);
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

    @Override
    public int compareTo(Person person) {
        // The compareTo method must return an integer like following:
        // -1 if object A is previous than object B
        // 0 if both objects are equal
        // 1 if object B is forward than object A
        return this.name.compareTo(person.name);
    }

    @Override
    public boolean equals(Object object) {
        // The method equals will compare the property name
        Person person = (Person) object;
        return this.name.equals(person.name);
    }

    @Override
    public int hashCode() {
        // The method hashCode will be based on the same
        return this.name.hashCode();
    }

}
