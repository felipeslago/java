package jse16_inheritance;

public class Manager extends Employee { // O comando extends determina que a classe Manager ira herder da classe
                                        // Employee

    /**
     * Uma classe pode herdar apenas uma unica classe
     */

    /**
     * Quando herdamos uma classe, herdamos tambem seus metodos e atributos (com excessao de metodos e atributos
     * private) A classe herdada e chamada de super classe e a classe que herda e chamada de sub classe
     */

    int password; // e possivel declarar novas propriedades e metodos, mesmo que nao existam na super classe

    /**
     * Atraves do comando super podemos chamar metodos da classe pai
     */

    public Manager(String name, double salary) {
        super(name, salary);
    }

    /**
     * Mesmo que nao estejam visiveis, os atributos e metodos podem ser acessados diretamente pelo nome
     */

    public void showEmployee() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }

    /**
     * Tambem e possivel reescrever metodos da super classe com novas regras
     */

    @Override
    public double getBonus() {
        return this.salary * 0.2;
    }

}
