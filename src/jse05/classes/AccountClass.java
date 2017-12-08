package jse05.classes;

/**
 * Aqui começamos com o conceito de orientação a objetos
 * <p>
 * Objeto:
 * Um objeto é um pacote de software que possuí estados e comportamentos
 * Ele é geralmente utilizado para modelar objetos do mundo real que encontramos todos os dias
 * <p>
 * Classe:
 * Uma classe é um protótipo a partir de onde os objetos são criados
 * Como por exemplo as bicicletas, pois todas são criadas a partir de um mesmo molde e possuem os mesmo comportamentos e estados
 * Cada bicicleta é única e não compartilha do estado e comportamento da outra
 */

class AccountClass { // O comando class determina a criação de uma classe

    /**
     * Uma classe possuí campos, chamados as variáveis
     */

    int number;

    String owner;

    double balance;

    double limit;

    /**
     * Uma classe possuí métodos
     * <p>
     * Os métodos definem o comportamento dos objetos criados a partir da classe
     * Eles podem manipular informações de dentro deles, receber informações de fora e até devolver valores para quem os chamou
     * <p>
     * Um método é composto por um identificador de resposta, seu nome e seus parâmetros
     * <p>
     * O identificador de resposta define que tipo de resposta esse método dará para quem o chamou
     * Pode ser void, ou seja, não devolverá nada, não terá retorno
     * Ou pode devolver algum tipo como int, String ou qualquer outro tipo de objeto
     * <p>
     * Após o identificador vem o nome do método
     * E entre os () são definidos os parâmetros que o método irá receber (tipo da variável e nome da variável)
     */

    void withdraw (double value) {
        /**
         * Para acessar os campos do próprio objeto utilize o comando this
         * Isso irá diferenciar o que é do objeto, do que veio para ele por parâmetro, por exemplo
         */
        this.balance = this.balance + value;
    }

    void deposit (double value) {
        this.balance = this.balance - value;
    }

    double totalBalance () {
        /**
         * Este método está sinalizando que irá retornar um tipo double
         * Para que isso seja feito, o comando return deve ser utilizado para retornar o que for desejado
         */
        return this.limit + this.balance;
    }

    /**
     * Os métodos são únicos dentro da classe, seguindo o modelo nome + parâmetros
     */

    void setOwner (String owner) {
        this.owner = owner;
    }

}
