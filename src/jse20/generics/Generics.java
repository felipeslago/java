package jse20.generics;

import java.util.List;

public class Generics {

    /**
     * O uso de generics permite definir classes e interfaces genéricas parametrizadas através de tipos específicos
     *
     * Dentre os benefícios do uso de generics estão: - Possibilidade de reutilizar o mesmo código com entradas
     * diferentes - Checagem de compatibilidade de tipo em tempo de compilação - Elimina a necessidade de cast entre
     * objetos - Possibilita a criação de algorítimos genéricos
     *
     * Uma classe genérica é definida da seguinte forma: - class name<T1, T2, ..., Tn> { }
     *
     * Padrão de nomeclatura para parâmetros: E -> elemento, K -> chave, N -> número, T -> tipo V -> valor, S/U/V -> 2°,
     * 3° e 4° tipos
     */

    class Shape<T> { // Para ter mais de um tipo basta utilizar uma vírgula e especificar os demais <T1, T2, ..., Tn>

        private T t;

        public void set(T t) {
            this.t = t;
        }

        public T get() {
            return this.t;
        }
    }

    class Circle {
        String name;
    }

    class Square {
        String name;
    }

    public void execute() {
        /**
         * A criação de uma classe genérica é feita através da passagem do tipo dentro dos braquetes <> após o nome da
         * classe
         */

        Shape<Circle> circle = new Shape<Circle>();

        /**
         * A partir do Java 7 foi criada a notação Diamond, a qual não obriga que o tipo seja especificado também após a
         * palavra new, fazendo com que o tipo seja inferido na criação do objeto
         */

        Shape<Square> square = new Shape<>();

        /**
         * Também é possível especificar tipos parametrizados
         */

        Shape<List<Square>> squareList = new Shape<>();
    }

    public static void main(String[] args) {
        Generics generics = new Generics();
        generics.execute();
    }
}
