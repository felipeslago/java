package z.z30_DesignPatterns_Decorator;

public class Customs extends Tax {

    public Customs() {
        super();
    }

    public Customs(Tax tax) {
        super(tax);
    }

    @Override
    public double calculate(Budget budget) {
        double tax = budget.getAmount() * 0.03;
        System.out.println("Customs: " + tax);
        return tax + calculateAnotherTax(budget);
    }

}
