package jse05.classes;

public class Constructor {

	/**
	 * Um construtor é um método invocado assim que o objeto é criado
     * Ele obriga que quem o criou informe seus os parâmetros definidos por ele
     */
	
	int age;
	String name;

	/**
     * O construtor é sempre um método com o mesmo nome da classe
     */

	/**
     * Neste caso temos um construtor vazio, portanto nenhum parâmetro é obrigatório
     */
	
	Constructor() {
		
		/**
         * No construtor, sempre que um objeto é criado, as expressões dentro do construtor serão executadas
         */
		
		this.age = 18;
		this.name = "Java";
	}

	/**
     * Aqui temos um construtor que está esperando receber dois parâmetros
     * Repare que utilizamos o overload de métodos aqui
     */
	
	Constructor(int age, String name) {
		this.age = age;
		this.name = name;
	}
}
