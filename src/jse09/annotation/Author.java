package jse09.annotation;

public @interface Author { // @interface define o tipo annotation

    /**
     * Uma annotation é um metadado que provê informações sobre o programa
     * São utilizadas para:
     * 1. Prover informações para o compilador, durante o tempo de compilação
     * 2. Serem utilizadas por outros frameworks que as processem em tempo de compilação, execução ou deploy, gerando código ou arquivos
     *
     */

	String author();
	String date();

}
