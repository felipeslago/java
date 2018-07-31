package jse17_abstract_classes;

@SuppressWarnings("unused")
abstract class Employee { // O comando abstract e utilizado para determinar que uma classe e abstrata

    /**
     * Uma classe abstrata apenas idealiza um tipo Por exemplo, um funcionario e um tipo muito generico Todos em uma
     * empresa sao funcionarios E todos funcionarios possuem coisas em comum, como matricula, nome e salario
     */

    /**
     * A classe abstrata vai apenas idealizar esse tipo junto com seus atributos e metodos Porem, ela apenas pode ser
     * herdada, nunca instanciada
     */

    private static int counter = 0;

    private int employeeId;

    protected String name;

    protected double salary;

    public Employee(String name, double salary) {
        Employee.counter++;
        this.employeeId = Employee.counter;
        this.name = name;
        this.salary = salary;
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

    /**
     * Classes abstratas podem ter metodos abstratos Os metodos abstratatos funcionam como as assinaturas de metodos em
     * uma interface Eles devem ser reescritos na classe que herdar esta classe
     */

    abstract double getBonus();

}
