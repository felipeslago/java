package jse20_generics;

public class RawTypes {

    class Generic<T> {
        T t;

        void set(T t) {
            this.t = t;
        }
    }

    void execute() {

        /**
         * Raw Type e o termo utilizado para a criacao de uma classe generica sem especificar seu tipo
         *
         * Porem, classes nao genericas e interfaces nao sao consideradas Raw Types
         */

        Generic generic = new Generic();

        /**
         * Um objeto Raw Type pode receber como atribuicao um object generics
         */

        Generic<Integer> integerGeneric = new Generic<>();
        generic = integerGeneric;

        /**
         * Porem, o contrario ira gerar uma warning durante a compilacao (unchecked or unsafe operation) Isso acontece,
         * pois o Generic tem seu tipo especificado, enquanto o Raw Type nao
         */

        Generic<Double> doubleGeneric = generic;

        /**
         * Da mesma forma que a chamada de um metodo em um objeto Raw Type ira gerar outro warning
         */

        generic.set(doubleGeneric);
    }

    public static void main(String[] args) {
        RawTypes rawTypes = new RawTypes();
        rawTypes.execute();
    }

}
