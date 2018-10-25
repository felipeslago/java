package jse27_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {

    /**
     * A interface List eh uma Collection ordenada que permite elementos repetidos, alem de permitir o acesso posicional
     * aos elementos, buscas, iteracao e sublistas
     *
     * Existem duas implementacoes gerais para a interface List:
     *
     * ArrayList: eh uma lista de tamanho variavel, ou seja, conforme elementos sao adicionados a ele, seu tamanho varia
     * dinamicamente. Possui muita performance nas chamadas get e set
     *
     * LinkedList: eh uma lista duplamente ligada, que tambem implementa a Queue Interface, adicionando mais metodos de
     * filas. Possui muita performance nas chamadas add e remove
     */

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(Arrays.asList("A", "B", "B", "C", "D", "E"));
        List<String> linkedList = new LinkedList<>(Arrays.asList("A", "B", "B", "C", "D", "E"));

        System.out.println(arrayList.get(1));
        System.out.println(linkedList.get(5));

        System.out.print("ArrayList:=");

        for (String s : arrayList) {
            System.out.print(s + " ");
        }

        System.out.print("\nLinkedList:=");

        for (String s : linkedList) {
            System.out.print(s + " ");
        }
    }

}
