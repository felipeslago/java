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
         * Raw Type é o termo utilizado para a criação de uma classe genérica sem especificar seu tipo
         *
         * Porém, classes não genéricas e interfaces não são consideradas Raw Types
         */

        Generic generic = new Generic();

        /**
         * Um objeto Raw Type pode receber como atribuição um object generics
         */

        Generic<Integer> integerGeneric = new Generic<>();
        generic = integerGeneric;

        /**
         * Porém, o contrário irá gerar uma warning durante a compilação (unchecked or unsafe operation) Isso acontece,
         * pois o Generic tem seu tipo especificado, enquanto o Raw Type não
         */

        Generic<Double> doubleGeneric = generic;

        /**
         * Da mesma forma que a chamada de um método em um objeto Raw Type irá gerar outro warning
         */

        generic.set(doubleGeneric);
    }

    public static void main(String[] args) {
        RawTypes rawTypes = new RawTypes();
        rawTypes.execute();
    }

}
