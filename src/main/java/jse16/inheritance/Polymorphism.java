package jse16.inheritance;

public class Polymorphism {

    /**
     * Imagine que precisamos criar um metodo que mostre o bonus dos funcionarios da empresa Ja temos o metodo getBonus
     * na classe Employee, entao podemos acessa-los fazendo uso do polimorfismo O metodo calculateBonus vai receber um
     * Employee e como Manager herda Employee, ele possui os mesmos metodos
     */

    /**
     * Ao chamar o metodo getBonus, sera utilizado o metodo correspodente Portanto o getBonus do Manager sera o da
     * classe Manager
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
