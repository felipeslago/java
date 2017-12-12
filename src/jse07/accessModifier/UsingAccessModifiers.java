package jse07.accessModifier;

public class UsingAccessModifiers {

    public static void main (String[] args) {

        /**
         * No exemplo abaixo, temos o objeto AccessModifier, que possuí as variáveis age, name e studying
         */

        AccessModifier obj = new AccessModifier();

        /**
         * Apenas a variável age é public, ou seja, conseguimos acessar ela diretamente
         *
         * A variável grade é protected, conseguimos acessar ela diretamente desde que estejamos dentro do mesmo pacote (package)
         *
         * Porém as variáveis name e studying precisam ser acessadas através dos getters e setters criados na classe
         */

        obj.age = 18;
        obj.setName("Java");
        obj.grade = "High School";

        System.out.println("Name: " + obj.getName());
        System.out.println("O aluno está estudando? R: " + obj.isStudying());
        System.out.println("Grau do aluno: " + obj.grade);
    }

}
