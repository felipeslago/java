package jsez28.DesignPatterns.ChainOfResponsibility;

public class DiscountCalculator {

	public double calculate(Receipt receipt) {
		
		Discount d1 = new Discount20Off();
		Discount d2 = new Discount30Off();
		Discount d3 = new Discount50Off();
		
		d1.setNextDiscount(d2);
		d2.setNextDiscount(d3);
		
		return d1.discount(receipt);
	}
	
}
