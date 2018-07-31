package jse20_generics;

import java.util.List;

public class Generics {

    /**
     * O uso de generics permite definir classes e interfaces genericas parametrizadas atraves de tipos especificos
     *
     * Dentre os beneficios do uso de generics estao: - Possibilidade de reutilizar o mesmo codigo com entradas
     * diferentes - Checagem de compatibilidade de tipo em tempo de compilacao - Elimina a necessidade de cast entre
     * objetos - Possibilita a criacao de algoritimos genericos
     *
     * Uma classe generica e definida da seguinte forma: - class name<T1, T2, ..., Tn> { }
     *
     * Padrao de nomeclatura para parametros: E -> elemento, K -> chave, N -> numero, T -> tipo V -> valor, S/U/V -> 2o,
     * 3o e 4o tipos
     */

    class Shape<T> { // Para ter mais de um tipo basta utilizar uma virgula e especificar os demais <T1, T2, ..., Tn>

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
         * A criacao de uma classe generica e feita atraves da passagem do tipo dentro dos braquetes <> apos o nome da
         * classe
         */

        Shape<Circle> circle = new Shape<Circle>();

        /**
         * A partir do Java 7 foi criada a notacao Diamond, a qual nao obriga que o tipo seja especificado tambem apos a
         * palavra new, fazendo com que o tipo seja inferido na criacao do objeto
         */

        Shape<Square> square = new Shape<>();

        /**
         * Tambem e possivel especificar tipos parametrizados
         */

        Shape<List<Square>> squareList = new Shape<>();
    }

    public static void main(String[] args) {
        Generics generics = new Generics();
        generics.execute();
    }
}
