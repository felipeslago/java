package jse15.interfaces;

public class MyCar implements OperateCar { // O comando implements determina que a classe MyCar irá implementar o contrato da interface OperateCar

	/**
	 * Utilizando uma , após a interface é possível implementar mais de uma interface
     */
	
	Direction direction;
	int speed;
	
	/**
     * Uma interface não pode ser instanciada, ela deve ser implementada
     * Ou seja, todas as assinaturas de métodos descritas na interface devem ser implementadas na classe
     * Caso os métodos não sejam implementados, a classe não irá compilar
     */
	
	@Override // A anotação Override indica que o método direction está sobrescrevendo a assinatura da interface
	public void direction(Direction direction) {
		this.direction = direction;
	}

	@Override
	public void speedUp(int speed) {
		System.out.println("Acelerando o carro...");
		this.speed += speed;
	}

	@Override
	public void speedDown(int speed) {
		System.out.println("Desacelerando o carro...");
		this.speed -= speed;
	}

	@Override
	public void stop() {
		System.out.println("Parando o carro...");
		this.speed = 0;
	}

	@Override
	public int speed() {
		return this.speed;
	}

	public void honk() {
        System.out.println("Honked!");
    }
	
}
