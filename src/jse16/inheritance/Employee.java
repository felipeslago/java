package jse16.inheritance;

public class Employee {

	/**
	 * Imagine que em uma empresa existem funcionários, representados pela classe Employee
	 * Porém, também existem gerentes e diretores
	 * Todos eles tem propriedades em comum, como matrícula, nome e salário
	 * Para evitar a criação de várias classes repetindo as mesmas propriedades, podemos utilizar a herança
	 */
	
	private static int counter = 0;
	private int employeeId;
	public String name; 
	public double salary;
	
	public Employee(String name, double salary) {
		Employee.counter++;
		this.employeeId = Employee.counter;
		this.name = name;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getBonus() {
		return this.salary * 0.1;
	}
	
}
