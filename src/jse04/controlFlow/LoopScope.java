package jse04.controlFlow;

public class LoopScope {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			/**
			 * Dentro desse loop está o escopo da variável i
		 	*/
			System.out.println(i);
			
		}
		
		/**
		 * Porém a variável i não existe mais aqui
	 	*/
		
	}
	
}
