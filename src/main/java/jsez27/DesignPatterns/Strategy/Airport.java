package jsez27.DesignPatterns.Strategy;

public class Airport implements Tax {

	public double calculate(Budget budget) {
		return budget.getAmount() * 0.01;
	}

}
