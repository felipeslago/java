package jse16.inheritance;

public class Manager
        extends Employee { // O comando extends determina que a classe Manager irá herder da classe Employee

    /**
     * Uma classe pode herdar apenas uma única classe
     */

    /**
     * Quando herdamos uma classe, herdamos também seus métodos e atributos (com excessão de métodos e atributos private)
     * A classe herdada é chamada de super classe e a classe que herda é chamada de sub classe
     */

    int password; // É possível declarar novas propriedades e métodos, mesmo que não existam na super classe

    /**
     * Através do comando super podemos chamar métodos da classe pai
     */

    public Manager (String name, double salary) {
        super(name, salary);
    }

    /**
     * Mesmo que não estejam visiveis, os atributos e métodos podem ser acessados diretamente pelo nome
     */

    public void showEmployee () {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }

    /**
     * Também é possível reescrever métodos da super classe com novas regras
     */

    @Override
    public double getBonus () {
        return this.salary * 0.2;
    }

}
