package jse06.objects;

public class GarbageCollector {

    /**
     * Algumas linguagens orientadas a objeto necessitam que seja feito o controle e rastreamento de um objeto
     * Ou seja, seria necessário rastrear o momento em que um objeto é criado e depois destruí-lo quando não fosse mais útil
     * A destruição do objeto se faz necessária, uma vez que cada objeto ocupa um espaço na memória e se não for destruído, o programa irá consumir toda a memória do computador rapidamente
     * <p>
     * Fazer esse gerenciamento de memória pode ser uma tarefa tediosa e induzida a erros
     * Para isso, a plataforma Java dispoe de um processo chamado Garbage Collection
     * O Java Runtime Environment destroi os objetos que julga não serem mais utilizados
     */

    public static void main (String[] args) {
        Person person = new Person();
        person.name = "Carl";

        System.out.println("Person name: " + person.name);
    }

    /**
     * Dentro do método main foi criada a variável person, mas logo após o fim do método, a variável está elegivel a ser destruida pelo Garbage Collector
     * Outra forma de destruir uma variavel, é atribuir o valor null
     * Um objeto é elegivel ao Garbage Collector a partir do momento que não possuí mais nenhuma referência
     */
}
