package z.z30_DesignPatterns_Decorator;

public class Airport extends Tax {

    public Airport() {
        super();
    }

    public Airport(Tax tax) {
        super(tax);
    }

    @Override
    public double calculate(Budget budget) {
        double tax = budget.getAmount() * 0.01;
        System.out.println("Airport: " + tax);
        return tax + calculateAnotherTax(budget);
    }

}
