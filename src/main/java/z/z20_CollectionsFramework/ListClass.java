package z.z20_CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClass {

    @SuppressWarnings({ "rawtypes", "unused", "unchecked" })
    public static void main(String[] args) {

        // A list is a collection that permits duplicated elements and keeps an specific ordination
        // The most commonly used list interface is the ArrayList class
        // It works with an intern array to generate a list and it is faster in searching than the LinkedList class

        ArrayList alist = new ArrayList<>();

        List anotherList = new ArrayList(); // It is possible to abstract the list from its interface

        alist.add("Some text");
        alist.add("Another text"); // The method add adds objects to the list
        alist.add(0, "First text"); // Is possible to add a text in a specific position

        // The list class do not specifies the size of the list, it changes depending on the amount of items

        System.out.println(alist.size()); // The method size returns the total of items in the list
        System.out.println(alist.get(0)); // The method get returns the item in a specified position

        Person p1 = new Person("John", 20);
        Person p2 = new Person("Carl", 25);
        Person p3 = new Person("Lily", 30);

        List peopleList = new ArrayList();

        peopleList.add(p1);
        peopleList.add(p2);
        peopleList.add(p3);

        for (int i = 0; i < peopleList.size(); i++) {
            Person person = (Person) peopleList.get(i); // When using lists to store objects, the casting is needed to
                                                        // use the the object methods and attributes
            System.out.println(person.getInformation());
        }

        peopleList.remove(p1); // The method remove removes the object passed from the list
        System.out.println(peopleList.contains(p1)); // The method contains returns a boolean indicating if the passed
                                                     // object is in the list

        // The sequential access, like above, is not a recommended way to go through a loop in a ArrayList object
        // Always use an Iterator or enhanced-for

        for (Object object : peopleList) {
            Person person = (Person) object;
            System.out.println(person.getInformation());
        }

        // The LinkedList class uses the same interface as ArrayList
        // But the most difference between this class and the ArrayList class is the performance
        // The LinkedList is more performative using the add and remove methods
        // But the ArrayList is more performative using get and set methods

        LinkedList llist = new LinkedList();

        llist.add("some text");
        llist.add("another text");
    }

}
