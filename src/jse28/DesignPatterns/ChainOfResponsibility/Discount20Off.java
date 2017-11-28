package jse28.DesignPatterns.ChainOfResponsibility;

public class Discount20Off implements Discount {

	private Discount nextDiscount;
	
	@Override	
	public double discount(Receipt receipt) {
		if(receipt.getTotalItems() <= 5) {
			return receipt.getValue() * 0.2;
		} else {
			return nextDiscount.discount(receipt);
		}
	}

	@Override
	public void setNextDiscount(Discount discount) {
		this.nextDiscount = discount;
	}

}
