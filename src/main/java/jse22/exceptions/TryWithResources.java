package jse22.exceptions;

import java.io.Closeable;
import java.io.IOException;

public class TryWithResources {

    class Foo implements Closeable {
        @Override
        public void close() throws IOException {
        }
    }

    public void execute() {

        /**
         * Uma variacao do bloco try/catch e o try with resources
         *
         * Essa variacao faz o "trabalho sujo" de fechar o objeto para voce, desde que a classe do objeto criado
         * implemente uma das interfaces Closeable ou AutoCloseable
         *
         * Em outras palavras, ao final do bloco try/catch, independente se houver ou nao uma excecao, o metodo close do
         * objeto sera sempre chamado, como se estivesse dentro de um bloco finally
         */

        try (Foo foo = new Foo()) { // A criacao do objeto e feita dentro dos parenteses do bloco try
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {
        TryWithResources tryWithResources = new TryWithResources();
        tryWithResources.execute();
    }

}
