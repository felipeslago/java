package jse22_exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionClass {

    /**
     * Exception e um evento que ocorre durante a execucao de um programa, que quebra um fluxo normal de instrucoes
     *
     * Quando uma exception ocorre dentro de um metodo, o metodo cria um objeto e o entrega para o ambiente de execucao
     *
     * Este objeto, chamado de exception, contem informacoes sobre o erro, incluindo o seu tipo e estado do programa
     * quando o erro ocorreu
     *
     * Esse processo de criar um objeto exception e entrega-lo para o ambiente de execucao e chamado de "throwing"
     *
     * Depois que uma exception e lancada, a aplicacao busca por algo que saiba tratar essa excecao
     *
     * Essa busca resulta em uma lista ordenada de metodos que focam invocados ate a exception ser gerada, chamada de
     * call stack
     *
     * O ambiente de execucao procura por blocos de codigo que saibam lidar com essa exception, chamados de exception
     * handler
     *
     * Quando um handler apropriado e encontrado, o ambiente de execucao passa o objeto exception para esse handler, que
     * captura essa excecao
     *
     * Se o ambiente de execucao nao encontrar nenhum handler, a execucao do programa e encerrada
     */

    /**
     * Existem tres tipos de exception:
     *
     * Checked: esse tipo obriga que, o metodo chamador, trate determinado tipo conhecido de excecao, evitando assim que
     * o programa seja encerrado caso ocorra algum problema
     *
     * Error (unchecked): sao excecoes externas ao programa em execucao, condicoes que a aplicacao usualmente nao
     * consegue antecipar ou tratar, como por exemplo um problema no hardware do computador
     *
     * Runtime (unchecked): ao contrario do error, esse tipo de exception deve-se a um problema do proprio programa
     * (bugs, erros de logica, uso erroneo de apis e etc.) que tambem nao pode ser antecipada ou tratada
     */

    public static void main(String[] args) {

        /**
         * Uma divisao por zero resultara em uma unchecked exception, pois foi um erro de programacao e nao tem como o
         * compilador saber que isso dara problemas
         */

        int a = 2;
        int b = 0;

        int i = a / b;
        System.out.println(i);

        try {
            /**
             * Se olharmos a assinatura do construtor da classe FileInputStream, veremos que ele informa (palavra
             * throws) que uma IOException pode ser lancada:
             *
             * public FileInputStream(String name) throws FileNotFoundException
             *
             * Sendo assim, somos obrigados a fazer um tratamento (handler) para essa exception
             */

            FileInputStream fis = new FileInputStream("file.txt"); // This is checked exception and must be treated

            /**
             * Existem duas maneiras de tratar uma exception
             *
             * 1. Utilizando o bloco try/catch
             *
             * 2. Continuar enviando a excecao para os metodos da hierarquia de chamada (lista de classes chamadoras)
             * para que seja tratada em outro lugar
             */

            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
