package jse04.controlFlow;

public class WhileDoWhile {

	public static void main(String[] args) {
		
		/**
		 * A declaração while executa repetidamente até que a condição seja satisfeita
        */
		
		int i = 0;
		System.out.println("Valor de i: " + i);
		
		while(i < 10) { // Executa até a condição ser satisfeita
			i++;
			System.out.println("Valor de i: " + i);
		}
		
		/**
         * Já a declaração do...while executa primeiro e depois avalia se a condição é verdadeira
        */
		
		System.out.println("--------------------------");
		
		System.out.println("Valor de i: " + i);
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while(i < 10);
	}
	
}
