package jse07.accessModifier;

public class UsingAccessModifiers {

    public static void main (String[] args) {

        /**
         * No exemplo abaixo, temos o objeto AccessModifier, que possu� as vari�veis age, name e studying
         */

        AccessModifier obj = new AccessModifier();

        /**
         * Apenas a vari�vel age � public, ou seja, conseguimos acessar ela diretamente
         *
         * A vari�vel grade � protected, conseguimos acessar ela diretamente desde que estejamos dentro do mesmo pacote (package)
         *
         * Por�m as vari�veis name e studying precisam ser acessadas atrav�s dos getters e setters criados na classe
         */

        obj.age = 18;
        obj.setName("Java");
        obj.grade = "High School";

        System.out.println("Name: " + obj.getName());
        System.out.println("O aluno est� estudando? R: " + obj.isStudying());
        System.out.println("Grau do aluno: " + obj.grade);
    }

}
