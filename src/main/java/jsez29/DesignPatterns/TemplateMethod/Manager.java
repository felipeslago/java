package jsez29.DesignPatterns.TemplateMethod;

public class Manager extends Employee {

	public Manager(int employeeID, String name) {
		super(employeeID, name);
	}

	@Override
	public boolean reachedTheGoal(Sales sales) {
		return sales.items > 1000 && sales.total > 100000.0;
	}

	@Override
	public double minKickback(Sales sales) {
		return sales.total * 0.1;
	}

	@Override
	public double maxKickback(Sales sales) {
		return sales.total * 0.3;
	}

}
