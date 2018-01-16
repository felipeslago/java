package jsez30.DesignPatterns.Decorator;

public class UsingDecorator {
	
	// The Decorator Pattern is used to compose behavior with other classes
	// In other words one class absorbs the behavior of another to execute all together
	
	// The solution is create an abstract class that receives the same object class type and a method that executes its method
	
	public static void main(String[] args) {
		
		TaxCalculator tc = new TaxCalculator();
		
		Tax complexTax = new Airport(new Customs(new Transportation()));
		
		Budget budget1 = new Budget("Cargo 1", 20000.0);
		
		tc.calculate(budget1, complexTax);
		
		Budget budget2 = new Budget("Cargo 2", 70000.0);
		
		tc.calculate(budget2, complexTax);
		
	}
	
}
