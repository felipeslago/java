package jsez24.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		List<Company> companies = new  ArrayList<>();
		companies.add(new Company("A", 120));
		companies.add(new Company("B", 50));
		companies.add(new Company("C", 150));
		companies.add(new Company("D", 75));
		
		// Stream is a new interface introduced by Java 8
		// It has some methods to facilitate the interaction with collections
		
		// The simple way to get a stream is invoking the stream method from a collection
		
		Stream<Company> s = companies.stream();
		
		// The stream object has many methods, like the filter method
		// It receives a criteria, that must returns true or false, and returns a new stream object
		// The collection will not be modified
		
		s = companies.stream().filter(c -> c.getEmployees() > 100); // Using lambda to specify a criteria that gets all companies with more than 100 employees
		
		// It is possible to iterate the stream by using the forEach method
		
		s.forEach(c -> System.out.println(c.getName()));
		
		// But the stream object can be eliminated and the line simplified as below
		
		companies.stream()
			.filter(c -> c.getEmployees() > 100)
			.forEach(c -> System.out.println(c.getName()));
		
		// It is possible to generate a new stream just with some information
		// By using the map method the new information is mapped to another stream
		
		companies.stream()
			.filter(c -> c.getEmployees() > 100)
			.map(c -> c.getEmployees()) // Creating a map just with the total of employees
			.forEach(e -> System.out.println(e));
		
		// And it is possible to simplify the code by using the Method References
		
		companies.stream()
			.filter(c -> c.getEmployees() > 100)
			.map(Company::getEmployees)
			.forEach(System.out::println);
		
		// When the map was called above, it returned a new Stream<Integer>
		// Be careful about that because it is a primitive stream and it will autoboxing the int values
		// It will use many resources of JVM and can be expensive if the collections is large
		// So the Stream interface offers a mapToInt method that returns a IntStream and offers specific int methods, like sum
		
		companies.stream()
			.filter(c -> c.getEmployees() > 100)
			.mapToInt(Company::getEmployees)
			.forEach(System.out::println);
		
		int sum = companies.stream()
					.filter(c -> c.getEmployees() > 100)
					.mapToInt(Company::getEmployees)
					.sum();
		
		System.out.println(sum);
		
		// Another method from Stream interface is the findAny
		// This method returns any occurrence that matches the criteria
		// It returns an Optional object, that is a new class in Java 8
		// The Optional class provides many methods to treat null values
		
		Optional<Company> o = companies.stream()
								.filter(c -> c.getEmployees() > 100)
								.findAny();
		
		// Given an Optional object it is possible to get its contents by using the get method
		// It will return the wanted object or an exception if it is null
		
		Company c1 = o.get();
		System.out.println(c1.getName());
		
		// The orElse method returns the wanted object or, if it is null, returns what was passed by argument
		
		Company c2 = o.orElse(null);
		System.out.println(c2.getName());
		
		// The ifPresent method executes a lambda command if the object exists
		
		o.ifPresent(c -> System.out.println(c.getName()));
		
		// The collect method generates a new collection from the stream by receiving a Collector by argument
		// The toList method generates a new List
		
		companies = companies.stream()
						.filter(c -> c.getEmployees() > 100)
						.collect(Collectors.toList());
		
		// The toMap method generates a new Map like below
		// It receives two arguments to form the key value pair
		
		Map<String, Integer> m = companies.stream()
									.filter(c -> c.getEmployees() > 100)
									.collect(Collectors.toMap(c -> c.getName(), c -> c.getEmployees()));
		
		m.forEach((x, y) -> System.out.println(x));
	}
	
}
