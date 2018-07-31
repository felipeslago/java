package z.z20_CollectionsFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {

    public static void main(String[] args) {

        // The Map class is part of the Collections Framework, but not extends Collections class
        // This class maps a key with a value and do not accept duplicated values
        // It has four principal implementations: HashMap, LinkedHashMap, TreeMap and HashTable

        // The HasMap class has no order to store the keys and values, it has its own order
        // It is a thread-safe class and unsynchronized, that means this class permits nulls values

        Map<String, Integer> people1 = new HashMap<>();

        people1.put("Lily", 25); // The first argument is the key and the second is the value
        people1.put("John", 30);
        people1.put("Carl", 20);
        people1.put("Carl", 20); // Duplicated key value pair will not be added
        people1.put(null, null);

        System.out.println(people1);

        System.out.println(people1.keySet()); // The method keySet returns the keys in the map
        System.out.println(people1.values()); // The method values returns the values in the map
        System.out.println(people1.get("John")); // The method get returns the value of the key passed
        System.out.println(people1.size()); // The method size returns the size of the map

        // The LinkedHashMap preserves the insertion order

        Map<String, Integer> people2 = new LinkedHashMap<>();

        people2.put("Lily", 25);
        people2.put("John", 30);
        people2.put("Carl", 20);

        System.out.println(people2);

        // The TreeMap class is ordered by the key

        Map<String, Integer> people3 = new TreeMap<>();

        people3.put("Lily", 25);
        people3.put("John", 30);
        people3.put("Carl", 20);

        System.out.println(people3);

        // The HashTable class is similar than HashMap class unless it is synchronized and do not permits nulls values

        Map<String, Integer> people4 = new Hashtable<>();

        people4.put("Lily", 25);
        people4.put("John", 30);
        people4.put("Carl", 20);

        System.out.println(people4);
    }

}
