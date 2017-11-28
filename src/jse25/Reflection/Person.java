package jse25.Reflection;

@SuppressWarnings("unused")
public class Person {

	public String firstName;
	public String lastName;
	public int age;
	public String address;
	public String passport;
	private int id = 999;
	private String password = "123456";
	
	public Person() {
		
	}

	public Person(String firstName, String lastName, Integer age, String address, String passport) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.passport = passport;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	private void privateMethod() {
		System.out.println("This is a private method");
	}

	@Override
	public String toString() {
		return "Person [" +
				"firstName=" + this.firstName + ", " +
				"lastName=" + this.lastName + ", " +
				"age=" + this.age + ", " +
				"address=" + this.address + ", " +
				"passport=" + this.passport + "]";
	}
}
