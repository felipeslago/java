package jse30.DesignPatterns.Decorator;

public class TaxCalculator {

	public void calculate(Budget budget, Tax tax) {
		
		double value = tax.calculate(budget);
		
		System.out.println("Total: " + value);
		System.out.println();
	}
	
}
