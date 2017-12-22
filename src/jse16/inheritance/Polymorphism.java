package jse16.inheritance;

public class Polymorphism {

	/**
	 * Imagine que precisamos criar um método que mostre o bonus dos funcionários da empresa
     * Já temos o método getBonus na classe Employee, então podemos acessá-los fazendo uso do polimorfismo
     * O método calculateBonus vai receber um Employee e como Manager herda Employee, ele possuí os mesmos métodos
     */
	
	/**
     * Ao chamar o método getBonus, será utilizado o método correspodente
     * Portanto o getBonus do Manager será o da classe Manager
     */
	
	public static void showBonus(Employee employee) {
		System.out.println("Bonus: " + employee.getBonus());
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("John", 1000.0);
		Manager m1 = new Manager("Carl", 2000.0);
		
		showBonus(e1);
		showBonus(m1);
		
	}
	
}
