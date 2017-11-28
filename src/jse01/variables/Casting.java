package jse01.variables;

public class Casting {

	public static void main(String[] args) {

		/**
		 * � poss�vel atribuir uma vari�vel int em uma vari�vel double
		 * Por�m n�o � poss�vel atribuir uma vari�vel double em uma vari�vel int
		 * Isso acontece, pois a vari�vel double possu� uma parte decimal
	 	*/
		
		int i = 10;
		double d;

		d = i;

		/**
		 * Para fazer o inverso, ser� necess�rio fazer o casting da vari�vel
	 	*/

		i = (int) d;

		/**
		 * Utilizando o cast (int) � atribu�da somente a parte inteira do n�mero para a vari�vel int
 		*/

		System.out.println("int value: " + i);

	}
}
