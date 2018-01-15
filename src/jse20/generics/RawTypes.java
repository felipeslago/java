package jse20.generics;

public class RawTypes {

    class Generic<T> {
        T t;

        void set(T t) {
            this.t = t;
        }
    }

    void execute() {

        /**
         * Raw Type � o termo utilizado para a cria��o de uma classe gen�rica sem especificar seu tipo
         *
         * Por�m, classes n�o gen�ricas e interfaces n�o s�o consideradas Raw Types
         */

        Generic generic = new Generic();

        /**
         * Um objeto Raw Type pode receber como atribui��o um object generics
         */

        Generic<Integer> integerGeneric = new Generic<>();
        generic = integerGeneric;

        /**
         * Por�m, o contr�rio ir� gerar uma warning durante a compila��o (unchecked or unsafe operation) Isso acontece,
         * pois o Generic tem seu tipo especificado, enquanto o Raw Type n�o
         */

        Generic<Double> doubleGeneric = generic;

        /**
         * Da mesma forma que a chamada de um m�todo em um objeto Raw Type ir� gerar outro warning
         */

        generic.set(doubleGeneric);
    }

    public static void main(String[] args) {
        RawTypes rawTypes = new RawTypes();
        rawTypes.execute();
    }

}
