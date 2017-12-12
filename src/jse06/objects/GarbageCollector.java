package jse06.objects;

public class GarbageCollector {

    /**
     * Algumas linguagens orientadas a objeto necessitam que seja feito o controle e rastreamento de um objeto
     * Ou seja, seria necess�rio rastrear o momento em que um objeto � criado e depois destru�-lo quando n�o fosse mais �til
     * A destrui��o do objeto se faz necess�ria, uma vez que cada objeto ocupa um espa�o na mem�ria e se n�o for destru�do, o programa ir� consumir toda a mem�ria do computador rapidamente
     * <p>
     * Fazer esse gerenciamento de mem�ria pode ser uma tarefa tediosa e induzida a erros
     * Para isso, a plataforma Java dispoe de um processo chamado Garbage Collection
     * O Java Runtime Environment destroi os objetos que julga n�o serem mais utilizados
     */

    public static void main (String[] args) {
        Person person = new Person();
        person.name = "Carl";

        System.out.println("Person name: " + person.name);
    }

    /**
     * Dentro do m�todo main foi criada a vari�vel person, mas logo ap�s o fim do m�todo, a vari�vel est� elegivel a ser destruida pelo Garbage Collector
     * Outra forma de destruir uma variavel, � atribuir o valor null
     * Um objeto � elegivel ao Garbage Collector a partir do momento que n�o possu� mais nenhuma refer�ncia
     */
}
