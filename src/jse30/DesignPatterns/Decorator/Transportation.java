package jse30.DesignPatterns.Decorator;

public class Transportation extends Tax {

	public Transportation() {
		super();
	}
	
	public Transportation(Tax tax) {
		super(tax);
	}
	
	@Override
	public double calculate(Budget budget) {
		double tax = budget.getAmount() * 0.05;
		System.out.println("Transportation: " + tax);
		return tax + calculateAnotherTax(budget);
	}

}
