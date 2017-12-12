package jsez10.interfaces;

public interface OperateCar { // O comando interface determina a cria��o de uma interface

	/**
	 * Uma interface � um contrato, um tipo de refer�ncia, similar a uma classe
     * Por�m aceita apenas m�todos abstratos, m�todos default e m�todos est�ticos
     */
	
	void direction(Direction direction);
	void speedUp(int speed);
	void speedDown(int speed);
	void stop();
	int speed();
	
	/**
     * A interface diz para as classes o que elas devem fazer, mas n�o como devem fazer
     * Por exemplo:
     * Todos fabricantes de carros constroem carros e todos carros deve acelerar, frear e etc.
     * Por�m cada fabricante implementa isso da sua maneira
     * Esse � o contrato, a interface, existente entre os fabricantes
     */
	
}
