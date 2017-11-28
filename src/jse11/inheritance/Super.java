package jse11.inheritance;

public class Super extends Employee {

    private String field;

    /**
     * A palavra reservada super chama o método da super classe
     */

    public Super(String name, double salary, String field) {
        super(name, salary);
        this.field = field;
    }
}
