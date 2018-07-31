package z.z28_DesignPatterns_ChainOfResponsibility;

public class Receipt {

    private double value;
    private int totalItems;

    public Receipt(double value, int totalItems) {
        super();
        this.value = value;
        this.totalItems = totalItems;
    }

    public double getValue() {
        return value;
    }

    public int getTotalItems() {
        return totalItems;
    }

}
