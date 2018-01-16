package jse06.objects;

public class GarbageCollector {

    /**
     * Algumas linguagens orientadas a objeto necessitam que seja feito o controle e rastreamento de um objeto Ou seja,
     * seria necessario rastrear o momento em que um objeto e criado e depois destrui-lo quando nao fosse mais util A
     * destruicao do objeto se faz necessaria, uma vez que cada objeto ocupa um espaco na memoria e se nao for
     * destruido, o programa ira consumir toda a memoria do computador rapidamente
     * <p>
     * Fazer esse gerenciamento de memoria pode ser uma tarefa tediosa e induzida a erros Para isso, a plataforma Java
     * dispoe de um processo chamado Garbage Collection O Java Runtime Environment destroi os objetos que julga nao
     * serem mais utilizados
     */

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Carl";

        System.out.println("Person name: " + person.name);
    }

    /**
     * Dentro do metodo main foi criada a variavel person, mas logo apos o fim do metodo, a variavel esta elegivel a ser
     * destruida pelo Garbage Collector Outra forma de destruir uma variavel, e atribuir o valor null Um objeto e
     * elegivel ao Garbage Collector a partir do momento que nao possui mais nenhuma referencia
     */
}
