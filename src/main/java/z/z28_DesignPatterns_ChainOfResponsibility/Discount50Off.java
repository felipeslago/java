package z.z28_DesignPatterns_ChainOfResponsibility;

public class Discount50Off implements Discount {

    private Discount nextDiscount;

    @Override
    public double discount(Receipt receipt) {
        if (receipt.getTotalItems() <= 20) {
            return receipt.getValue() * 0.5;
        } else {
            return nextDiscount.discount(receipt);
        }
    }

    @Override
    public void setNextDiscount(Discount discount) {
        this.nextDiscount = discount;
    }

}
