package jse01.variables;

public class Casting {

	public static void main(String[] args) {

		/**
		 * É possível atribuir uma variável int em uma variável double
		 * Porém não é possível atribuir uma variável double em uma variável int
		 * Isso acontece, pois a variável double possuí uma parte decimal
	 	*/
		
		int i = 10;
		double d;

		d = i;

		/**
		 * Para fazer o inverso, será necessário fazer o casting da variável
	 	*/

		i = (int) d;

		/**
		 * Utilizando o cast (int) é atribuída somente a parte inteira do número para a variável int
 		*/

		System.out.println("int value: " + i);

	}
}
