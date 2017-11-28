package jse27.DesignPatterns.Strategy;

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
