package jse17.abstractClasses;

public class Analyst extends Employee {

    /**
     * As regras para herdar classes abstratas sao as mesmas que para herdar uma classe normal A diferenca e que os
     * metodos abstratos tem que ser reescritos
     */

    public Analyst(String name, double salary) {
        super(name, salary);
    }

    double getBonus() {
        return this.salary * 0.01;
    }

}
