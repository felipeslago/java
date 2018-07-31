package z.z27_DesignPatterns_Strategy;

public class Customs implements Tax {

    @Override
    public double calculate(Budget budget) {
        return budget.getAmount() * 0.03;
    }

}
