package z.z27_DesignPatterns_Strategy;

public class TaxCalculator {

    public double calculate(Budget budget, Tax tax) {

        return tax.calculate(budget);

    }

}