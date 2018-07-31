package jse09_final_modifier;

public class FinalBlankVariable {

    final String name; // Uma variavel final que nao e inicializada e chamada de blank variable

    public FinalBlankVariable() {
        this.name = "Java"; // O seu valor deve ser inicializado no construtor
    }

    static final int number; // Uma variavel static final pode ser uma blank variable tambem

    static {
        number = 10; // E deve ser inicializada no construtor estatico
    }
}
