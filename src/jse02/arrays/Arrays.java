package jse02.arrays;

public class Arrays {

	public static void main(String[] args) {
		
		/**
		 * Um array � um objeto container que guarda um determinado n�mero de valores de um �nico tipo
	 	*/
		
		int[] ages;         // Um array � declarado utilizando [] no tipo da vari�vel
		ages = new int[10]; // O tamanho do array � definido quando um objeto � criado, ap�s a palavra new
		
		/**
		 * A palavra new cria uma nova inst�ncia de um objeto na mem�ria
	 	*/
		
		ages[0] = 1; // Para atribuir um valor ao array � necess�rio especificar em qual posi��o esse valor ser� armazenado
		ages[1] = 2;
		ages[2] = 3;
		ages[3] = 4;
		ages[4] = 5;
		ages[5] = 6;
		ages[6] = 7;
		ages[7] = 8;
		ages[8] = 9;
		ages[9] = 10;
		
		/**
		 * Um array sempre come�a na posi��o 0, ou seja, se seu array tiver 10 posi��es, as posi��es ser�o de 0 a 9
	 	*/
		
		int[] values = {1, 2, 3, 4, 5}; // Tamb�m � poss�vel criar um novo array j� especificando seus valores
		
		/**
		 * Ap�s criado, o tamanho do array n�o pode ser alterado
	 	*/
		
		/**
		 * Para acessar o valor de um array, basta cham�-lo especificando a posi��o desejada
	 	*/
		
		System.out.println("Array ages na posi��o 5: " + ages[5]);
		
		System.out.println("Array values na posi��o 0: " + values[0]);
		
		/**
		 * Um array tamb�m pode ser bidimensional, tridimensional e etc.
	 	*/
		
		int[][] twoDimensional = new int[5][5];
		
		System.out.println("Array twoDimensional na posi��o 1,1: " + twoDimensional[0][0]);
		
		/**
		 * Atrav�s do m�todo System.arraycopy � poss�vel copiar o conte�do de um array para outro array
	 	*/
		
		System.out.println("------------------------------------------------------");
		
		int[] copyValues = new int[5];
		System.arraycopy(values, 0, copyValues, 0, 5);
		
		System.out.println("Array copyValues na posi��o 1: " + copyValues[0]);
		
		/**
         * Uma outra forma de acessar todos os elementos de um array, sem precisar acessar cada posi��o � utilizando a declara��o for
		 * Para maiores detalhes conferir o pacote jse04.controlFlow
        */
		
		System.out.println("------------------------------------------------------");
		
		for(int i = 0; i < values.length; i++) {
			System.out.println("Array de values na posi��o " + i + ":" + values[i]);
		}
		
		/**
         * Existe uma maneira mais f�cil de percorrer todos os elementos de uma cole��o, atrav�s da declara��o enhanced-for
         * Para maiores detalhes conferir o pacote jse04.controlFlow
        */
		
		System.out.println("------------------------------------------------------");
		
		for (int i : values) {
			System.out.println("Valor de i: " + i);
		}
	}
	
}
