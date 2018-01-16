package jse04.controlFlow;

public class LoopControl {

    public static void main(String[] args) {

        /**
         * Existem maneiras de controlar os loops das declaracoes, forcando o loop a parar ou ser executado de maneira
         * forcada
         */

        for (int i = 0; i < 10; i++) {
            if (i > 3) {
                break; // Essa instrucao encerra o loop, mesmo que a condicao da declaracao for nao esteja satisfeita
            }
            System.out.println("Valor de i: " + i);
        }

        System.out.println("-------------");

        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                continue; // Essa instrucao forca uma nova iteracao, ignorando as declaracoes abaixo dela
            }

            System.out.println("Valor de i: " + i); // Essa saida nao sera exibida equanto i for menor que 5
        }
    }
}
