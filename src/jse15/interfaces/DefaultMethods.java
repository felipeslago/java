package jse15.interfaces;

public interface DefaultMethods {

    /**
     * Os m�todos default e os m�todos est�ticos possibilitam adicionar funcionalidades as interfaces
     * Dessa maneira � poss�vel manter a compatibilidade com as classes que j� implementam essas interfaces, sem que necessitem de altera��o
     */

    void print (int value);

    static int sum (int a, int b) { // A palavra static cria um m�todo est�tico na interface
        return a + b;
    }

    /**
     * Como todos m�todos est�ticos, o m�todo acima pode ser chamado diretamente, sem a necessidade de instanciar uma classe
     */

    default void sumAndPrint (int a, int b) { // A palavra default cria um m�todo default na interface
        int sum = a + b;
        print(sum);
    }

    /**
     * J� os m�todos default, precisam de uma inst�ncia de uma classe que implemente sua interface, para serem utilizados
     */

}
