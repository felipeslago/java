package jse09.finalModifier;

public class FinalVariable {

	/**
	 * A palavra-chave final é utilizada para restringir o acesso em alguns contextos
     * Se a variável está definida como final, o seu valor não pode ser modificado
     */
	
	/**
     * Como seu valor não pode ser modificado, as variáveis devem obrigatoriamente ser inicializadas
     */
	
	final int number = 10; // Variável final inicializada
	static final String name = "Java"; // Variável estática final inicializada
	
	void increase() {
		// this.number++; // Esse código não irá compilar, pois o valor não pode ser modificado
	}
}
