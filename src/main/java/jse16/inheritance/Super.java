package jse16.inheritance;

public class Super extends Employee {

    private String field;

    /**
     * A palavra reservada super chama o metodo da super classe
     */

    public Super(String name, double salary, String field) {
        super(name, salary);
        this.field = field;
    }
}
