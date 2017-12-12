package jsez28.DesignPatterns.ChainOfResponsibility;

public class Discount30Off implements Discount {

	private Discount nextDiscount;
	
	@Override
	public double discount(Receipt receipt) {
		if(receipt.getTotalItems() <= 10) {
			return receipt.getValue() * 0.3;
		} else {
			return nextDiscount.discount(receipt);
		}
	}

	@Override
	public void setNextDiscount(Discount discount) {
		this.nextDiscount = discount;
	}

}
