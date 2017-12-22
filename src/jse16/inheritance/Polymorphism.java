package jse16.inheritance;

public class Polymorphism {

	/**
	 * Imagine que precisamos criar um m�todo que mostre o bonus dos funcion�rios da empresa
     * J� temos o m�todo getBonus na classe Employee, ent�o podemos acess�-los fazendo uso do polimorfismo
     * O m�todo calculateBonus vai receber um Employee e como Manager herda Employee, ele possu� os mesmos m�todos
     */
	
	/**
     * Ao chamar o m�todo getBonus, ser� utilizado o m�todo correspodente
     * Portanto o getBonus do Manager ser� o da classe Manager
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
