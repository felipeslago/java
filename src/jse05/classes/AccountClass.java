package jse05.classes;

	/**
	 * Aqui come�amos com o conceito de orienta��o a objetos
     *
     * Objeto:
     * Um objeto � um pacote de software que possu� estados e comportamentos
     * Ele � geralmente utilizado para modelar objetos do mundo real que encontramos todos os dias
     *
     * Classe:
     * Uma classe � um prot�tipo a partir de onde os objetos s�o criados
     * Como por exemplo as bicicletas, pois todas s�o criadas a partir de um mesmo molde e possuem os mesmo comportamentos e estados
     * Cada bicicleta � �nica e n�o compartilha do estado e comportamento da outra
    */

class AccountClass { // O comando class determina a cria��o de uma classe
	
	/**
     * Uma classe possu� campos, chamados as vari�veis
    */
	
	int number;
	String owner;
	double balance;
	double limit;
	
	/**
     * Uma classe possu� m�todos
     *
     * Os m�todos definem o comportamento dos objetos criados a partir da classe
     * Eles podem manipular informa��es de dentro deles, receber informa��es de fora e at� devolver valores para quem os chamou
     *
     * Um m�todo � composto por um identificador de resposta, seu nome e seus par�metros
     *
     * O identificador de resposta define que tipo de resposta esse m�todo dar� para quem o chamou
     * Pode ser void, ou seja, n�o devolver� nada, n�o ter� retorno
     * Ou pode devolver algum tipo como int, String ou qualquer outro tipo de objeto
     *
     * Ap�s o identificador vem o nome do m�todo
     * E entre os () s�o definidos os par�metros que o m�todo ir� receber (tipo da vari�vel e nome da vari�vel)
    */
	
	void withdraw(double value) {
		/**
         * Para acessar os campos do pr�prio objeto utilize o comando this
         * Isso ir� diferenciar o que � do objeto, do que veio para ele por par�metro, por exemplo
        */
		this.balance = this.balance + value;
	}
	
	void deposit(double value) {
		this.balance = this.balance - value;
	}
	
	double totalBalance() {
		/**
         * Este m�todo est� sinalizando que ir� retornar um tipo double
         * Para que isso seja feito, o comando return deve ser utilizado para retornar o que for desejado
        */
		return this.limit + this.balance;
	}
	
	/**
     * Os m�todos s�o �nicos dentro da classe, seguindo o modelo nome + par�metros
     */
	
	void setOwner(String owner) {
		this.owner = owner;
	}
	
	/**
     * Sendo assim, � poss�vel fazer um overload de m�todos
     * Ou seja, temos mais de um m�todo com o mesmo nome, por�m recebendo uma quantidade diferente de par�metros
     */
	
	void setOwner(String oldOwner, String newOwner) {
		if(this.owner.equals(oldOwner)) {
			this.owner = newOwner;
		}
	}

    /**
     * Ou podemos ter mais um m�todo com o mesmo nome, com a mesma quantidade de par�metros, por�m com tipos de par�metros diferentes
     */

	void deposit(int value) {
	    this.balance = this.balance + value;
    }
}
