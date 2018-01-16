package jse22.exceptions;

public class ThrowNewException {

    public double balance;

    /**
     * Imagine que temos um metodo que realiza saques da conta de clientes
     *
     * Como faremos para avisar o metodo chamador que o valor passado eh invalido ou que o cliente nao tem saldo?
     *
     * As exceptions sao bem indicadas para esse caso
     */

    public void withdram(double value) {

        /**
         * Atraves do comando throw new eh possivel lancar uma nova excecao em qualquer lugar do codigo
         *
         * Dessa maneira, o chamador sabera qual erro ocorreu a partir da exception lancada
         */

        if (value == 0) {
            throw new IllegalArgumentException("Valor informado invalido para saque");
        } else if (this.balance < value) {
            throw new IllegalArgumentException("Nao ha saldo suficiente para executar esta operacao");
        }
    }

}
