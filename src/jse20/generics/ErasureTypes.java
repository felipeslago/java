package jse20.generics;

public class ErasureTypes {

    /**
     * Durante o processo de compilação, o compilador Java substitui os tipos genéricos pela classe que ascende ao tipo
     * (no caso de bounded objects) ou por Object (para objetos unbounded)
     *
     * Exemplo de classe Unbounded
     */

    class NodeUnbounded<T> {
        T t;

        T get() {
            return this.t;
        }
    }

    /**
     * A classe NodeNodeUnbounded ficaria da sequinte maneira após ser compilada
     */

    class NodeUnboundedCompiled {
        Object t;

        Object get() {
            return this.t;
        }
    }

    /**
     * Exemplo de classe Bounded
     */

    class NodeBounded<T extends Number> {
        T t;

        T get() {
            return this.t;
        }
    }

    /**
     * A classe NodeBounded ficaria da sequinte maneira após ser compilada
     */

    class NodeBoundedCompiled {
        Number t;

        Number get() {
            return this.t;
        }
    }

}
