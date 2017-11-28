package jse05.classes;

public class AccessModifier {

	/**
	 * Os modificadores de acesso s�o utilizados para restringir campos e m�todos sejam acessados de atrav�s outras classes
	 *
	 * O modificador public permite que a classe, campo ou m�todo seja utilizado por qualquer outra classe
	 *
	 * O modificador private permite que apenas a pr�pria classe acesse o m�todo ou o campo
	 *
	 * Com isso, conseguimos garantir que outras classes n�o acessem indevidamente nossos m�todos ou classes
 	*/
	
	public int age;
	private String name;
	private boolean studying;
	
	/**
	 * Os campos definidos como private, muitas vezes possuem informa��es sens�veis, que n�o podem ser modificadas ou lidas
	 * Por�m existem situa��es em que um campo deve ser somente para leitura
	 * Ou ent�o existem regras para atribuir valor ao campo
	 * Nestes casos fazemos o uso dos getters e setters
 	*/
	
	/**
	 * Atrav�s do setter, recebemos uma informa��o e podemos valid�-la antes de atribuir ao campo de nossa classe
	 * Isso garante uma maior seguran�a para as regras da classe
 	*/
	
	public void setName(String name) {
		if(age > 10) {
			this.name = name;
		} else {
			System.out.println("O aluno precisa ter mais que 10 anos para estudar.");
		}
	}
	
	/**
	 * E atrav�s do getter podemos devolver a informa��o que quisermos para o usu�rio
 	*/
	
	public String getName() {
		return "Nome: " + this.name;
	}
	
	public void setStudying(boolean studying) {
		this.studying = studying;
	}
	
	/**
	 * Quando trabalhamos com campos boolean � boa pratica alterar o get para is
 	*/
	
	public boolean isStudying() {
		return this.studying;
	}
	
}
