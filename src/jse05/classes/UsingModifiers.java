package jse05.classes;

public class UsingModifiers {

	public static void main(String[] args) {

        /**
         * No exemplo abaixo, temos o objeto AccessModifier, que possuí as variáveis age, name e studying
         */

		AccessModifier obj = new AccessModifier();

        /**
         * Apenas a variável age é public, ou seja, conseguimos acessar ela diretamente
         *
         * Porém as variáveis name e studying precisam ser acessadas através dos getters e setters criados na classe
         */

		obj.age = 18;
		obj.setName("Java");

		System.out.println("Name: " + obj.getName());
		System.out.println("O aluno está estudando? R: " + obj.isStudying());
	}
	
}
