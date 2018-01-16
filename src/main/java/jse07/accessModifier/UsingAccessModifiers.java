package jse07.accessModifier;

public class UsingAccessModifiers {

    public static void main(String[] args) {

        /**
         * No exemplo abaixo, temos o objeto AccessModifier, que possui as variaveis age, name e studying
         */

        AccessModifier obj = new AccessModifier();

        /**
         * Apenas a variavel age e public, ou seja, conseguimos acessar ela diretamente
         *
         * A variavel grade e protected, conseguimos acessar ela diretamente desde que estejamos dentro do mesmo pacote
         * (package)
         *
         * Porem as variaveis name e studying precisam ser acessadas atraves dos getters e setters criados na classe
         */

        obj.age = 18;
        obj.setName("Java");
        obj.grade = "High School";

        System.out.println("Name: " + obj.getName());
        System.out.println("O aluno esta estudando? R: " + obj.isStudying());
        System.out.println("Grau do aluno: " + obj.grade);
    }

}
