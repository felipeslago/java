package jsez27.DesignPatterns.Strategy;

public class TaxCalculator {

	public double calculate(Budget budget, Tax tax) {
		
		return tax.calculate(budget);
		
	}
	
}
