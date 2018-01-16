package jse22.exceptions;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingAPI {

    /**
     * Para facilitar a identificacao de problemas e/ou acompanhamento de partes importantes da execucao de um programa
     * o pacote java.util disponibiliza uma API de log, que pode salvar as informacoes em arquivos, ao inves somente de
     * exibir o problema no console
     */

    static Logger logger = Logger.getLogger("package.name");

    static void error() throws IOException {
    }

    public static void main(String[] args) {
        try {
            error();
        } catch (IOException e) {
            logger.log(Level.WARNING, "Ocorreu um erro", e);
        }
    }

}
