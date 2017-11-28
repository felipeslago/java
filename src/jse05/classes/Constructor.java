package jse05.classes;

public class Constructor {

	/**
	 * Um construtor � um m�todo invocado assim que o objeto � criado
     * Ele obriga que quem o criou informe seus os par�metros definidos por ele
     */
	
	int age;
	String name;

	/**
     * O construtor � sempre um m�todo com o mesmo nome da classe
     */

	/**
     * Neste caso temos um construtor vazio, portanto nenhum par�metro � obrigat�rio
     */
	
	Constructor() {
		
		/**
         * No construtor, sempre que um objeto � criado, as express�es dentro do construtor ser�o executadas
         */
		
		this.age = 18;
		this.name = "Java";
	}

	/**
     * Aqui temos um construtor que est� esperando receber dois par�metros
     * Repare que utilizamos o overload de m�todos aqui
     */
	
	Constructor(int age, String name) {
		this.age = age;
		this.name = name;
	}
}
