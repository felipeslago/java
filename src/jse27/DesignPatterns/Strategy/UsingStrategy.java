package jse27.DesignPatterns.Strategy;

public class UsingStrategy {

	// Design Patterns are standard techniques that simplify the code by writing it in a simple way with Object Orientation
	
	// The Strategy Pattern is used to suppress multiples conditions (IFs or a lot of methods)
	// In this example the intention is to calculate different types of taxes for the same budget
	
	// The solution is create a unique method to calculate the tax in the TaxCalculator class 
	// And by using the polymorphsm receive the Budget and the Tax that must be calculated
	// In this solution, every class that is a Tax must implement the Tax Interface, ensuring that its have the method to calculate the Tax
	// The TaxCalculator class receives a Budget and a generic Tax and like every Tax has the calculate method its know what to do
	// This solution doesn't have many conditions (IFs) or many methods
	
	public static void main(String[] args) {
		
		TaxCalculator tc = new TaxCalculator();
		
		Airport airportTax = new Airport();
		Customs customsTax = new Customs();
		Transportation transportationTax = new Transportation();
		
		Budget budget1 = new Budget("Cargo 1", 20000.0);
		
		System.out.println("Airport: " + tc.calculate(budget1, airportTax));
		System.out.println("Customs: " + tc.calculate(budget1, customsTax));
		System.out.println("Transportation: " + tc.calculate(budget1, transportationTax));
		System.out.println();
		
		Budget budget2 = new Budget("Cargo 2", 70000.0);
		
		System.out.println("Airport: " + tc.calculate(budget2, airportTax));
		System.out.println("Customs: " + tc.calculate(budget2, customsTax));
		System.out.println("Transportation: " + tc.calculate(budget2, transportationTax));
		
	}
	
}
