package jse22_exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class TryCatch {

    public static void method1() throws IOException {
    }

    public static void method2() throws SQLException {
    }

    public static void method3() throws IndexOutOfBoundsException, ClassNotFoundException {
    }

    public static void main(String[] args) {

        /**
         * O bloco try/catch e utilizado para criar um handler para exceptions
         */

        try {

            /**
             * Coloque dentro do bloco try os codigos que devem ser analisados e tratados caso ocorra uma exception
             *
             * Quando uma excecao e lancada e corresponde ao tipo especificado, a execucao e redirecionada para dentro
             * do bloco catch
             */

            method1(); // Se uma excecao for lancada aqui

            /**
             * Se uma excecao for lancada no linha no codigo acima, as linhas abaixo desse codigo serao ignoradas
             */

            method2(); // Essa linha sera ignorada
            method3();

        } catch (IOException e) { // Dentro dos parenteses e declarada a tipo de exception que sera tratada
            /**
             * Dentro do bloco catch sera feito o tratamento da excecao
             */
        } catch (SQLException e) {
            /**
             * E possivel tratar mais de uma excecao para o mesmo bloco try, basta adicionar um bloco de exception novo
             */

        } catch (IndexOutOfBoundsException | ClassNotFoundException e) {
            /**
             * Tambem eh possivel tratar mais de uma exception no mesmo handler, separadas por |
             */
        }

        finally {

            /**
             * Por fim temos o bloco finally que sempre sera executado, independentemente se uma excecao for lancada ou
             * nao
             *
             * Esse bloco costuma ser utilizado para encerrar conexoes com o banco de dados e fechar arquivos abertos
             * para leitura/escrita
             */
        }

    }

}
