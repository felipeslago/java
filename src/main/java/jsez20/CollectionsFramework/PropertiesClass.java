package jsez20.CollectionsFramework;

import java.util.Properties;

public class PropertiesClass {

	public static void main(String[] args) {
		
		// The Properties class is also a map, but it works just with String on key value pair
		// It is common used to create apps configurations
		
		Properties config = new Properties();
		
		config.setProperty("app.username", "username");
		config.setProperty("app.password", "password");
		config.setProperty("app.timeout", "200");
		
		System.out.println(config.entrySet()); // The method entrySet returns all the keys value pair
		System.out.println(config.get("app.username")); // The method get returns the value of the passed key
		config.remove("app.password"); // The remove method removes the passed key
		
		System.out.println(config.entrySet());
		
	}
	
}
