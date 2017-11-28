package jse30.DesignPatterns.Decorator;

public class Budget {

	private String name;
	private double amount;
	
	public Budget(String name, double amount) {
		super();
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}
	
}
