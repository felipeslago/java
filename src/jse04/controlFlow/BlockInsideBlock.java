package jse04.controlFlow;

public class BlockInsideBlock {

	/**
	 * É possível colocar um loop dentro de outro, através de um novo escopo {}
	 */

	public static void main(String[] args) {
		
		int i = 10;
		
		while(i > 0) {
			for(int z = 0; z <= 1; z++) {
				
				System.out.println("Valor de i: " + i);
				System.out.println("Valor de z: " + z);
				System.out.println("------------");
			}
			i--;
		}
		
	}
	
}
