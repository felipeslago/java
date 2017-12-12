package jsez28.DesignPatterns.ChainOfResponsibility;

public interface Discount {

	public double discount(Receipt receipt);
	public void setNextDiscount(Discount discount);
	
}
