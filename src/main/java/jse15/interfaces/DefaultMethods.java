package jse15.interfaces;

public interface DefaultMethods {

    /**
     * Os metodos default e os metodos estaticos possibilitam adicionar funcionalidades as interfaces Dessa maneira e
     * possivel manter a compatibilidade com as classes que ja implementam essas interfaces, sem que necessitem de
     * alteracao
     */

    void print(int value);

    static int sum(int a, int b) { // A palavra static cria um metodo estatico na interface
        return a + b;
    }

    /**
     * Como todos metodos estaticos, o metodo acima pode ser chamado diretamente, sem a necessidade de instanciar uma
     * classe
     */

    default void sumAndPrint(int a, int b) { // A palavra default cria um metodo default na interface
        int sum = a + b;
        print(sum);
    }

    /**
     * Ja os metodos default, precisam de uma instancia de uma classe que implemente sua interface, para serem
     * utilizados
     */

}
