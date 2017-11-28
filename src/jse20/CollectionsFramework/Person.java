package jse20.CollectionsFramework;

public class Person implements Comparable<Person> {

	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getInformation() {
		return "Name: " + this.name + " - Age: " + this.age;
	}
	
	@Override
	public int compareTo(Person person) { // Tells the JVM how to compare this object
		
		return this.name.compareTo(person.name); // Compare by name
		
		/*if(this.age < person.age) { // Compare by age
			return -1;
		} else if(this.age == person.age) {
			return 0;
		} else {
			return 1;
		}*/
		
	}
	
	@Override
	public String toString() { // Tells the JVM what to show
		return this.name;
	}
}
