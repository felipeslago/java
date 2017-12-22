package jse15.interfaces;

public interface DefaultMethods {

    /**
     * Os métodos default e os métodos estáticos possibilitam adicionar funcionalidades as interfaces
     * Dessa maneira é possível manter a compatibilidade com as classes que já implementam essas interfaces, sem que necessitem de alteração
     */

    void print (int value);

    static int sum (int a, int b) { // A palavra static cria um método estático na interface
        return a + b;
    }

    /**
     * Como todos métodos estáticos, o método acima pode ser chamado diretamente, sem a necessidade de instanciar uma classe
     */

    default void sumAndPrint (int a, int b) { // A palavra default cria um método default na interface
        int sum = a + b;
        print(sum);
    }

    /**
     * Já os métodos default, precisam de uma instância de uma classe que implemente sua interface, para serem utilizados
     */

}
