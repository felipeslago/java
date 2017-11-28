package jse29.DesignPatterns.TemplateMethod;

public abstract class Employee implements Commission {

	public int employeeID;
	public String name;
	public Sales sales;
	
	public Employee(int employeeID, String name) {
		super();
		this.employeeID = employeeID;
		this.name = name;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sales getSales() {
		return sales;
	}

	public void setSales(Sales sales) {
		this.sales = sales;
	}

	@Override
	public double calculateKickback() {
		if(reachedTheGoal(this.sales)) {
			return maxKickback(this.sales);
		} else {
			return minKickback(this.sales);
		}
	}
	
	public abstract boolean reachedTheGoal(Sales sales);
	public abstract double minKickback(Sales sales);
	public abstract double maxKickback(Sales sales);
	
}
