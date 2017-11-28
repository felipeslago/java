package jse02.arrays;

public class Arrays {

	public static void main(String[] args) {
		
		/**
		 * Um array é um objeto container que guarda um determinado número de valores de um único tipo
	 	*/
		
		int[] ages;         // Um array é declarado utilizando [] no tipo da variável
		ages = new int[10]; // O tamanho do array é definido quando um objeto é criado, após a palavra new
		
		/**
		 * A palavra new cria uma nova instância de um objeto na memória
	 	*/
		
		ages[0] = 1; // Para atribuir um valor ao array é necessário especificar em qual posição esse valor será armazenado
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
		 * Um array sempre começa na posição 0, ou seja, se seu array tiver 10 posições, as posições serão de 0 a 9
	 	*/
		
		int[] values = {1, 2, 3, 4, 5}; // Também é possível criar um novo array já especificando seus valores
		
		/**
		 * Após criado, o tamanho do array não pode ser alterado
	 	*/
		
		/**
		 * Para acessar o valor de um array, basta chamá-lo especificando a posição desejada
	 	*/
		
		System.out.println("Array ages na posição 5: " + ages[5]);
		
		System.out.println("Array values na posição 0: " + values[0]);
		
		/**
		 * Um array também pode ser bidimensional, tridimensional e etc.
	 	*/
		
		int[][] twoDimensional = new int[5][5];
		
		System.out.println("Array twoDimensional na posição 1,1: " + twoDimensional[0][0]);
		
		/**
		 * Através do método System.arraycopy é possível copiar o conteúdo de um array para outro array
	 	*/
		
		System.out.println("------------------------------------------------------");
		
		int[] copyValues = new int[5];
		System.arraycopy(values, 0, copyValues, 0, 5);
		
		System.out.println("Array copyValues na posição 1: " + copyValues[0]);
		
		/**
         * Uma outra forma de acessar todos os elementos de um array, sem precisar acessar cada posição é utilizando a declaração for
		 * Para maiores detalhes conferir o pacote jse04.controlFlow
        */
		
		System.out.println("------------------------------------------------------");
		
		for(int i = 0; i < values.length; i++) {
			System.out.println("Array de values na posição " + i + ":" + values[i]);
		}
		
		/**
         * Existe uma maneira mais fácil de percorrer todos os elementos de uma coleção, através da declaração enhanced-for
         * Para maiores detalhes conferir o pacote jse04.controlFlow
        */
		
		System.out.println("------------------------------------------------------");
		
		for (int i : values) {
			System.out.println("Valor de i: " + i);
		}
	}
	
}
