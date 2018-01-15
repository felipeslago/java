package jse21.packages;

import static java.lang.Math.random;

import java.util.List;

public class UsingPackages {

    /**
     * Os pacotes podem ser importados dentro dos tipos atrav�s do comando import
     * 
     * Ao importar determinado tipo, ele ficar� dispon�vel para uso
     *
     * Lembre-se que somente tipos p�blicos podem ser importados em outro pacotes, enquanto tipos protected podem ser
     * importados dentro de tipos do mesmo pacote
     *
     * OBS.: O pacote java.lang sempre � importado automaticamente para todas as classes
     */

    public static void main(String[] args) {
        Packages packages = new Packages(); // Por as classes estarem dentro do mesmo pacote, n�o � necess�rio o import

        List list; // Essa classe foi importada no come�o desse arquivo

        java.util.ArrayList arrayList; // � poss�vel utilizar o full qualified name (nome do pacote + nome da classe)

        random(); // E tamb�m � poss�vel utilizar m�todos diretamente atrav�s de imports est�ticos (import static)

        /**
         * E tamb�m � poss�vel fazer o import de tudo que estiver dentro de um determinado pacote, atrav�s do uso de *
         * Ex.: import.java.util.*;
         */

    }
}
