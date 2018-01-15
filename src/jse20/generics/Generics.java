package jse20.generics;

import java.util.List;

public class Generics {

    /**
     * O uso de generics permite definir classes e interfaces gen�ricas parametrizadas atrav�s de tipos espec�ficos
     *
     * Dentre os benef�cios do uso de generics est�o: - Possibilidade de reutilizar o mesmo c�digo com entradas
     * diferentes - Checagem de compatibilidade de tipo em tempo de compila��o - Elimina a necessidade de cast entre
     * objetos - Possibilita a cria��o de algor�timos gen�ricos
     *
     * Uma classe gen�rica � definida da seguinte forma: - class name<T1, T2, ..., Tn> { }
     *
     * Padr�o de nomeclatura para par�metros: E -> elemento, K -> chave, N -> n�mero, T -> tipo V -> valor, S/U/V -> 2�,
     * 3� e 4� tipos
     */

    class Shape<T> { // Para ter mais de um tipo basta utilizar uma v�rgula e especificar os demais <T1, T2, ..., Tn>

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
         * A cria��o de uma classe gen�rica � feita atrav�s da passagem do tipo dentro dos braquetes <> ap�s o nome da
         * classe
         */

        Shape<Circle> circle = new Shape<Circle>();

        /**
         * A partir do Java 7 foi criada a nota��o Diamond, a qual n�o obriga que o tipo seja especificado tamb�m ap�s a
         * palavra new, fazendo com que o tipo seja inferido na cria��o do objeto
         */

        Shape<Square> square = new Shape<>();

        /**
         * Tamb�m � poss�vel especificar tipos parametrizados
         */

        Shape<List<Square>> squareList = new Shape<>();
    }

    public static void main(String[] args) {
        Generics generics = new Generics();
        generics.execute();
    }
}
