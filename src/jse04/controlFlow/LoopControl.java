package jse04.controlFlow;

public class LoopControl {

	public static void main(String[] args) {
		
		/**
		 * Existem maneiras de controlar os loops das declarações, forçando o loop a parar ou ser executado de maneira forçada
        */
		
		for(int i = 0; i < 10; i++) {
			if(i > 3) {
				break; // Essa instrução encerra o loop, mesmo que a condição da declaração for não esteja satisfeita
			}
			System.out.println("Valor de i: " + i);
		}
		
		System.out.println("-------------");
		
		for(int i = 0; i < 10; i++) {
			if(i < 5) {
				continue; // Essa instrução força uma nova iteração, ignorando as declarações abaixo dela
			}
			
			System.out.println("Valor de i: " + i); // Essa saída não será exibida equanto i for menor que 5
		}
	}
}
