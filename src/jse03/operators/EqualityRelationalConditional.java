package jse03.operators;

public class EqualityRelationalConditional {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/**
		 * Os operadores de igualdade e relacional determinam se um operador é maior que, menor que, igual ou diferente de outro operador
	 	*/
		
		int a = 10;
		int b = 5;
		boolean result;
		
		/**
         * Esses operadores devolvem um valor true ou false dependendo do teste executado
        */
		
		result = a == b; // Os operadores = e == são diferentes e executam funções diferentes
		System.out.println("Operador de igualdade a == b: " + result);
		
		result = a != b;
		System.out.println("Operador de diferença a != b: " + result);
		
		result = a > b;
		System.out.println("Operador de maior que a > b: " + result);
		
		result = a >= b;
		System.out.println("Operador de maior ou igual que a >= b: " + result);
		
		result = a < b;
		System.out.println("Operador de menor que a < b: " + result);
		
		result = a <= b;
		System.out.println("Operador de menor ou igual que a <= b: " + result);
		
		System.out.println("----------------------");
		
		/**
         * Os operadores condicionais auxiliam a determinar se mais de um teste executado é verdadeiro ou falso
        */
		
		/**
         * O operador && determina se todos os resultados da expressão são verdadeiros
        */
		
		result = true && true; 
		System.out.println("Operador condicional &&: " + result);
		
		result = false && true; 
		System.out.println("Operador condicional &&: " + result);
		
		result = false && false; 
		System.out.println("Operador condicional &&: " + result);
		
		/**
         * O operador || determina se pelo menos um dos resultados da expressão é verdadeiro
        */
		
		result = true || true; 
		System.out.println("Operador condicional ||: " + result);
		
		result = false || true; 
		System.out.println("Operador condicional ||: " + result);
		
		result = false || false; 
		System.out.println("Operador condicional ||: " + result);
	}
	
}
