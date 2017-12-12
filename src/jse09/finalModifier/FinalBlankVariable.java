package jse09.finalModifier;

public class FinalBlankVariable {

	final String name; // Uma variável final que não é inicializada é chamada de blank variable
	
	public FinalBlankVariable() {
		this.name = "Java"; // O seu valor deve ser inicializado no construtor
	}
	
	static final int number; // Uma variável static final pode ser uma blank variable também
	
	static {
		number = 10; // E deve ser inicializada no construtor estático
	}
}
