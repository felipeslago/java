package z.z29_DesignPatterns_TemplateMethod;

public class Salesman extends Employee {

    public Salesman(int employeeID, String name) {
        super(employeeID, name);
    }

    @Override
    public boolean reachedTheGoal(Sales sales) {
        return sales.items > 100 && sales.total > 10000.0;
    }

    @Override
    public double minKickback(Sales sales) {
        return sales.total * 0.05;
    }

    @Override
    public double maxKickback(Sales sales) {
        return sales.total * 0.15;
    }

}
