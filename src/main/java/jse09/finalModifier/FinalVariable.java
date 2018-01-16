package jse09.finalModifier;

public class FinalVariable {

    /**
     * A palavra-chave final e utilizada para restringir o acesso em alguns contextos Se a variavel esta definida como
     * final, o seu valor nao pode ser modificado
     */

    /**
     * Como seu valor nao pode ser modificado, as variaveis devem obrigatoriamente ser inicializadas
     */

    final int number = 10; // Variavel final inicializada
    static final String name = "Java"; // Variavel estatica final inicializada

    void increase() {
        // this.number++; // Esse codigo nao ira compilar, pois o valor nao pode ser modificado
    }
}
