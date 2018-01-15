package jse21.packages;

import static java.lang.Math.random;

import java.util.List;

public class UsingPackages {

    /**
     * Os pacotes podem ser importados dentro dos tipos através do comando import
     * 
     * Ao importar determinado tipo, ele ficará disponível para uso
     *
     * Lembre-se que somente tipos públicos podem ser importados em outro pacotes, enquanto tipos protected podem ser
     * importados dentro de tipos do mesmo pacote
     *
     * OBS.: O pacote java.lang sempre é importado automaticamente para todas as classes
     */

    public static void main(String[] args) {
        Packages packages = new Packages(); // Por as classes estarem dentro do mesmo pacote, não é necessário o import

        List list; // Essa classe foi importada no começo desse arquivo

        java.util.ArrayList arrayList; // É possível utilizar o full qualified name (nome do pacote + nome da classe)

        random(); // E também é possível utilizar métodos diretamente através de imports estáticos (import static)

        /**
         * E também é possível fazer o import de tudo que estiver dentro de um determinado pacote, através do uso de *
         * Ex.: import.java.util.*;
         */

    }
}
