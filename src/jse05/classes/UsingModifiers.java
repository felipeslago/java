package jse05.classes;

public class UsingModifiers {

	public static void main(String[] args) {

        /**
         * No exemplo abaixo, temos o objeto AccessModifier, que possu� as vari�veis age, name e studying
         */

		AccessModifier obj = new AccessModifier();

        /**
         * Apenas a vari�vel age � public, ou seja, conseguimos acessar ela diretamente
         *
         * Por�m as vari�veis name e studying precisam ser acessadas atrav�s dos getters e setters criados na classe
         */

		obj.age = 18;
		obj.setName("Java");

		System.out.println("Name: " + obj.getName());
		System.out.println("O aluno est� estudando? R: " + obj.isStudying());
	}
	
}
