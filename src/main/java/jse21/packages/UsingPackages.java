package jse21.packages;

import static java.lang.Math.random;

import java.util.List;

public class UsingPackages {

    /**
     * Os pacotes podem ser importados dentro dos tipos atraves do comando import
     * 
     * Ao importar determinado tipo, ele ficara disponivel para uso
     *
     * Lembre-se que somente tipos publicos podem ser importados em outro pacotes, enquanto tipos protected podem ser
     * importados dentro de tipos do mesmo pacote
     *
     * OBS.: O pacote java.lang sempre e importado automaticamente para todas as classes
     */

    public static void main(String[] args) {
        Packages packages = new Packages(); // Por as classes estarem dentro do mesmo pacote, nao e necessario o import

        List list; // Essa classe foi importada no comeco desse arquivo

        java.util.ArrayList arrayList; // e possivel utilizar o full qualified name (nome do pacote + nome da classe)

        random(); // E tambem e possivel utilizar metodos diretamente atraves de imports estaticos (import static)

        /**
         * E tambem e possivel fazer o import de tudo que estiver dentro de um determinado pacote, atraves do uso de *
         * Ex.: import.java.util.*;
         */

    }
}
