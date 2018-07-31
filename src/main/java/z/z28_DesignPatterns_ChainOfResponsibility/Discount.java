package z.z28_DesignPatterns_ChainOfResponsibility;

public interface Discount {

    public double discount(Receipt receipt);

    public void setNextDiscount(Discount discount);

}
