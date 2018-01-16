package jse16.inheritance;

public class Employee {

    /**
     * Imagine que em uma empresa existem funcionarios, representados pela classe Employee Porem, tambem existem
     * gerentes e diretores Todos eles tem propriedades em comum, como matricula, nome e salario Para evitar a criacao
     * de varias classes repetindo as mesmas propriedades, podemos utilizar a heranca
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
