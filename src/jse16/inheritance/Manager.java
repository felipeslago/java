package jse16.inheritance;

public class Manager
        extends Employee { // O comando extends determina que a classe Manager ir� herder da classe Employee

    /**
     * Uma classe pode herdar apenas uma �nica classe
     */

    /**
     * Quando herdamos uma classe, herdamos tamb�m seus m�todos e atributos (com excess�o de m�todos e atributos private)
     * A classe herdada � chamada de super classe e a classe que herda � chamada de sub classe
     */

    int password; // � poss�vel declarar novas propriedades e m�todos, mesmo que n�o existam na super classe

    /**
     * Atrav�s do comando super podemos chamar m�todos da classe pai
     */

    public Manager (String name, double salary) {
        super(name, salary);
    }

    /**
     * Mesmo que n�o estejam visiveis, os atributos e m�todos podem ser acessados diretamente pelo nome
     */

    public void showEmployee () {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }

    /**
     * Tamb�m � poss�vel reescrever m�todos da super classe com novas regras
     */

    @Override
    public double getBonus () {
        return this.salary * 0.2;
    }

}
