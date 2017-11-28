package jse12.abstractClasses;

public class Analyst extends Employee {

	/**
     * As regras para herdar classes abstratas são as mesmas que para herdar uma classe normal
     * A diferença é que os métodos abstratos tem que ser reescritos
     */
	
	public Analyst(String name, double salary) {
		super(name, salary);
	}

	double getBonus() {
		return this.salary * 0.01;
	}

}
