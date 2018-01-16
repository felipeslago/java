package jse02.arrays;

public class Arrays {

    public static void main(String[] args) {

        /**
         * Um array e um objeto container que guarda um determinado numero de valores de um unico tipo
         */

        int[] ages; // Um array e declarado utilizando [] no tipo da variavel
        ages = new int[10]; // O tamanho do array e definido quando um objeto e criado, apos a palavra new

        /**
         * A palavra new cria uma nova instancia de um objeto na memoria
         */

        ages[0] = 1; // Para atribuir um valor ao array e necessario especificar em qual posicao esse valor sera
                     // armazenado
        ages[1] = 2;
        ages[2] = 3;
        ages[3] = 4;
        ages[4] = 5;
        ages[5] = 6;
        ages[6] = 7;
        ages[7] = 8;
        ages[8] = 9;
        ages[9] = 10;

        /**
         * Um array sempre comeca na posicao 0, ou seja, se seu array tiver 10 posicoes, as posicoes serao de 0 a 9
         */

        int[] values = { 1, 2, 3, 4, 5 }; // Tambem e possivel criar um novo array ja especificando seus valores

        /**
         * Apos criado, o tamanho do array nao pode ser alterado
         */

        /**
         * Para acessar o valor de um array, basta chama-lo especificando a posicao desejada
         */

        System.out.println("Array ages na posicao 5: " + ages[5]);

        System.out.println("Array values na posicao 0: " + values[0]);

        /**
         * Um array tambem pode ser bidimensional, tridimensional e etc.
         */

        int[][] twoDimensional = new int[5][5];

        System.out.println("Array twoDimensional na posicao 1,1: " + twoDimensional[0][0]);

        /**
         * Atraves do metodo System.arraycopy e possivel copiar o conteudo de um array para outro array
         */

        System.out.println("------------------------------------------------------");

        int[] copyValues = new int[5];
        System.arraycopy(values, 0, copyValues, 0, 5);

        System.out.println("Array copyValues na posicao 1: " + copyValues[0]);

        /**
         * Uma outra forma de acessar todos os elementos de um array, sem precisar acessar cada posicao e utilizando a
         * declaracao for Para maiores detalhes conferir o pacote jse04.controlFlow
         */

        System.out.println("------------------------------------------------------");

        for (int i = 0; i < values.length; i++) {
            System.out.println("Array de values na posicao " + i + ":" + values[i]);
        }

        /**
         * Existe uma maneira mais facil de percorrer todos os elementos de uma colecao, atraves da declaracao
         * enhanced-for Para maiores detalhes conferir o pacote jse04.controlFlow
         */

        System.out.println("------------------------------------------------------");

        for (int i : values) {
            System.out.println("Valor de i: " + i);
        }
    }

}
