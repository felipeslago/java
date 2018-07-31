package z.z24_Java8;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {

        // Instead of creating Comparator and Consumers to use the Default Methods of List class, it is possible to use
        // the lambda syntax

        List<String> names = new ArrayList<>();
        names.add("Carl");
        names.add("John");
        names.add("Bob");

        System.out.println(names);

        // It just need to declare the arguments first and what to do after the ->
        // There is no need to create methods or use the new keyword

        names.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // It can be read like:
        // Given the s1 and s2 Strings (it uses the same type passed in the generics argument), do something

        System.out.println(names);

        names.forEach(s -> System.out.println(s));

        // It can be read like:
        // Given the s String (it uses the same type passed in the generics argument), do something

        // The methods sort and forEach are Functional Interfaces
        // Functional Interfaces are interfaces that has just one abstract method, so the compiler knows what method is
        // being implemented while using lamda syntax
        // So after the ->, in lambda syntax, the method is implemented
    }

}
