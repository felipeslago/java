package jse04.controlFlow;

public class For {

	public static void main(String[] args) {
		
		/**
		 * A declaração for é executada até que determinada condição seja satisfeita
         * A grande diferença é que o valor de incremento pode ser definido dentro da própria declaração
        */
		
		for(int i = 0; i < 10; i++) {
			
			/**
             * Primeiramente é definida a variável que será iterada
             * Depois disso são definidas as condições
             * E por fim é definido como será o incremento/decremento da variável
            */
			
			System.out.println("Valor de i: " + i);
			
		}
		
		/**
         * Uma outra maneira de iterar por coleções de uma maneira mais fácil é através da declaração enhanced-for (for each)
         * Diferente do for tradicional, a declaração utiliza o objeto Iterator da coleção
         * Através desse objeto o for faz o seu próprio controle para verificar se a coleção ainda possuí elementos
        */
		
		System.out.println("---------------------");
		
		int[] values = {1, 2, 3, 4, 5};
		
		System.out.println("Valores do array values: ");
		
		for (int value : values) {
			System.out.println(value);
		}
		
	}
	
}
