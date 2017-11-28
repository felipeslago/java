package jse07.finalModifier;

public class FinalParameter {

	int number;
	
	/**
	 * Um parâmetro final recebido em um método não pode ter seu valor modificado
     * Seu valor é somente leitura
     */
	
	public void setNumber(final int number) {
		// number = 20; // Esse código não irá compilar
		this.number = number;
	}
	
}
