package jse14.annotations;

public @interface Author { // @interface define o tipo annotation

    /**
     * Uma annotation e um metadado que prove informacoes sobre o programa Sao utilizadas para: 1. Prover informacoes
     * para o compilador, durante o tempo de compilacao 2. Serem utilizadas por outros frameworks que as processem em
     * tempo de compilacao, execucao ou deploy, gerando codigo ou arquivos
     */

    String author();

    String date();

}
