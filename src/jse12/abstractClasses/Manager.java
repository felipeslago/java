package jse12.abstractClasses;

public class Manager extends Employee {

	public Manager(String name, double salary) {
		super(name, salary);
	}

	private int password;
	
	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
	public double getBonus() {
		return this.salary * 0.10;
	}
	
}
