package jsez30.DesignPatterns.Decorator;

public abstract class Tax {

	private final Tax anotherTax;
	
	public Tax() {
		this.anotherTax = null;
	}
	
	public Tax(Tax tax) {
		this.anotherTax = tax;
	}
	
	public abstract double calculate(Budget budget);
	
	protected double calculateAnotherTax(Budget budget) {
		if(this.anotherTax == null) {
			return 0;
		} else {
			return anotherTax.calculate(budget);
		}
	}
}
