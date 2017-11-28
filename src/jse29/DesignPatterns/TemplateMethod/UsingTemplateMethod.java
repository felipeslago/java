package jse29.DesignPatterns.TemplateMethod;

public class UsingTemplateMethod {

	// The Template Method Pattern is used to create a template to avoid repeated structures
	
	// In this example the intention is to calculate many different commissions based on total of items sold and its total amount
	// The Salesman and the Manager has different commissions and different goals of total items sold and total amount
	
	// The solution is create a default method to calculate the commission and pass the buck to the child classes for setting the calculations of total items and total amount
	
	public static void main(String[] args) {
		
		Employee salesman1 = new Salesman(1, "Carl");
		Employee salesman2 = new Salesman(2, "John");
		Employee salesman3 = new Salesman(3, "Lily");
		Employee manager = new Manager(4, "Bob");
		
		salesman1.setSales(new Sales(150, 15000.0));
		salesman2.setSales(new Sales(90, 20000.0));
		salesman3.setSales(new Sales(120, 9000.0));
		
		Sales managerSales = new Sales();
		managerSales.sumItems(salesman1.getSales().getItems());
		managerSales.sumItems(salesman2.getSales().getItems());
		managerSales.sumItems(salesman3.getSales().getItems());
		managerSales.sumTotal(salesman1.getSales().getTotal());
		managerSales.sumTotal(salesman2.getSales().getTotal());
		managerSales.sumTotal(salesman3.getSales().getTotal());
		
		manager.setSales(managerSales);
		
		System.out.println(salesman1.calculateKickback());
		System.out.println(salesman2.calculateKickback());
		System.out.println(salesman3.calculateKickback());
		System.out.println(manager.calculateKickback());
	}
	
}
