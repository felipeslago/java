package jse27_collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionsInterfaces {

    /**
     * As interfaces de colecoes encapsulam diferenes tipos de colecoes, o que nos permite manipula-las independente de
     * seus detalhes especificos, ou seja, colecoes abaixo de uma mesma interface possuem diferentes caracteristicas,
     * como por exemplo, ordem de armazenamento, maior velocidade de busca e etc., porem ao usar a interface principal,
     * eh possivel manipular essas diferentes colecoes igualmente, visto que a interface principal possui metodos
     * principais que todas as colecoes abaixo dela devem implementar
     *
     * Principais interfaces e suas colecoes implementadas:
     *
     * - Collection: interface principal que representa um grupo de objetos conhecidos por seus elementos
     *
     * -- Set: interface que extende de Collection. Nao permite elementos duplicados
     *
     * -- List: interface que extende de Collection. Permite elementos duplicados e tem o controle preciso de onde esta
     * cada elemento na lista, que podem ser acessados atraves de seu indice
     *
     * -- Queue: interface que extende de Collection. Armazena elementos que posteriormente serao utilziados para algum
     * processamento, geralmente utilizada para processos FIFO
     *
     * -- Deque: interface que extende de Collection. Armazena elementos que posteriormente serao utilziados para algum
     * processamento, geralmente utilizada para processos FIFO e LIFO, com a diferenca de que seus elementos podem ser
     * removidos tanto do comeco, quando do final da fila
     * 
     * - Map: interface para uso de informacoes chave-valor. Nao permite elementos duplicados
     */

    public static void main(String[] args) {
        Collection collection = null;
        Set set = new HashSet();
        List list = new ArrayList();
        Queue queue = new LinkedList();
        Deque deque = new ArrayDeque();

        collection = set;
        collection = list;
        collection = queue;
        collection = deque;

        Map map = new HashMap();
    }

}
