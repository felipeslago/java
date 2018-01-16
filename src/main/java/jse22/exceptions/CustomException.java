package jse22.exceptions;

public class CustomException {

    /**
     * Eh possivel criar exceptions customizadas, que sao muito uteis em casos especificos de regras de negocio, como no
     * exemplo dado na classe ThrowNewException
     * <p>
     * Para criar uma exception customizada, basta criar uma classe e extender de Exception
     */

    class AnotherException extends Exception {

        /**
         * A classe Exception ja possui alguns construtores que podem auxiliar na hora da criacao da exception
         * customizada
         */

        public AnotherException() {
            super();
        }

        public AnotherException(String message) {
            super(message);
        }
    }

    void execute() throws AnotherException {
        throw new AnotherException("Lancando uma excecao customizada");
    }

    public static void main(String[] args) {
        CustomException customException = new CustomException();
        try {
            customException.execute();
        } catch (AnotherException e) {
            e.printStackTrace();
        }
    }

}
