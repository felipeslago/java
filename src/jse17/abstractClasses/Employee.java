package jse17.abstractClasses;

@SuppressWarnings("unused")
abstract class Employee { // O comando abstract é utilizado para determinar que uma classe é abstrata

    /**
     * Uma classe abstrata apenas idealiza um tipo
     * Por exemplo, um funcionário é um tipo muito genérico
     * Todos em uma empresa são funcionários
     * E todos funcionários possuem coisas em comum, como matrícula, nome e salário
     */

    /**
     * A classe abstrata vai apenas idealizar esse tipo junto com seus atributos e métodos
     * Porém, ela apenas pode ser herdada, nunca instanciada
     */

    private static int counter = 0;

    private int employeeId;

    protected String name;

    protected double salary;

    public Employee (String name, double salary) {
        Employee.counter++;
        this.employeeId = Employee.counter;
        this.name = name;
        this.salary = salary;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public double getSalary () {
        return salary;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    /**
     * Classes abstratas podem ter métodos abstratos
     * Os métodos abstratatos funcionam como as assinaturas de métodos em uma interface
     * Eles devem ser reescritos na classe que herdar esta classe
     */

    abstract double getBonus ();

}
