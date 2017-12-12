package jsez10.interfaces;

public interface OperateCar { // O comando interface determina a criação de uma interface

	/**
	 * Uma interface é um contrato, um tipo de referência, similar a uma classe
     * Porém aceita apenas métodos abstratos, métodos default e métodos estáticos
     */
	
	void direction(Direction direction);
	void speedUp(int speed);
	void speedDown(int speed);
	void stop();
	int speed();
	
	/**
     * A interface diz para as classes o que elas devem fazer, mas não como devem fazer
     * Por exemplo:
     * Todos fabricantes de carros constroem carros e todos carros deve acelerar, frear e etc.
     * Porém cada fabricante implementa isso da sua maneira
     * Esse é o contrato, a interface, existente entre os fabricantes
     */
	
}
