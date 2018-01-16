package jse05.classes;

/**
 * Aqui comecamos com o conceito de orientacao a objetos
 *
 * Objeto: Um objeto e um pacote de software que possui estados e comportamentos Ele e geralmente utilizado para modelar
 * objetos do mundo real que encontramos todos os dias
 *
 * Classe: Uma classe e um prototipo a partir de onde os objetos sao criados Como por exemplo as bicicletas, pois todas
 * sao criadas a partir de um mesmo molde e possuem os mesmo comportamentos e estados Cada bicicleta e unica e nao
 * compartilha do estado e comportamento da outra
 */

public class AccountClass { // O comando class determina a criacao de uma classe

    /**
     * Uma classe possui campos, chamados as variaveis
     */

    int number;

    String owner;

    double balance;

    double limit;

    /**
     * Uma classe possui metodos Os metodos definem o comportamento dos objetos criados a partir da classe Eles podem
     * manipular informacoes de dentro deles, receber informacoes de fora e ate devolver valores para quem os chamou
     *
     * Um metodo e composto por um identificador de resposta, seu nome e seus parametros O identificador de resposta
     * define que tipo de resposta esse metodo dara para quem o chamou Pode ser void, ou seja, nao devolvera nada, nao
     * tera retorno Ou pode devolver algum tipo como int, String ou qualquer outro tipo de objeto
     *
     * Apos o identificador vem o nome do metodo E entre os () sao definidos os parametros que o metodo ira receber
     * (tipo da variavel e nome da variavel)
     */

    void withdraw(double value) {
        /**
         * Para acessar os campos do proprio objeto utilize o comando this Isso ira diferenciar o que e do objeto, do
         * que veio para ele por parametro, por exemplo
         */
        this.balance = this.balance + value;
    }

    void deposit(double value) {
        this.balance = this.balance - value;
    }

    double totalBalance() {
        /**
         * Este metodo esta sinalizando que ira retornar um tipo double Para que isso seja feito, o comando return deve
         * ser utilizado para retornar o que for desejado
         */
        return this.limit + this.balance;
    }

    /**
     * Os metodos sao unicos dentro da classe, seguindo o modelo nome + parametros
     */

    void setOwner(String owner) {
        this.owner = owner;
    }

}
