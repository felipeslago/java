package jse07_access_modifier;

public class AccessModifier {

    /**
     * Os modificadores de acesso sao utilizados para restringir campos e metodos sejam acessados de atraves outras
     * classes
     * <p>
     * O modificador public permite que a classe, campo ou metodo seja utilizado por qualquer outra classe
     * <p>
     * O modificador private permite que apenas a propria classe acesse o metodo ou o campo
     * <p>
     * O modificador protected permite que apenas classes dentro do mesmo pacote acessem o metodo ou o campo
     * <p>
     * Com isso, conseguimos garantir que outras classes nao acessem indevidamente nossos metodos ou classes
     */

    public int age;

    private String name;

    private boolean studying;

    protected String grade;

    /**
     * Os campos definidos como private, muitas vezes possuem informacoes sensiveis, que nao podem ser modificadas ou
     * lidas Porem existem situacoes em que um campo deve ser somente para leitura Ou entao existem regras para atribuir
     * valor ao campo Nestes casos fazemos o uso dos getters e setters
     */

    /**
     * Atraves do setter, recebemos uma informacao e podemos valida-la antes de atribuir ao campo de nossa classe Isso
     * garante uma maior seguranca para as regras da classe
     */

    public void setName(String name) {
        if (age > 10) {
            this.name = name;
        } else {
            System.out.println("O aluno precisa ter mais que 10 anos para estudar.");
        }
    }

    /**
     * E atraves do getter podemos devolver a informacao que quisermos para o usuario
     */

    public String getName() {
        return "Nome: " + this.name;
    }

    public void setStudying(boolean studying) {
        this.studying = studying;
    }

    /**
     * Quando trabalhamos com campos boolean e boa pratica alterar o get para is
     */

    public boolean isStudying() {
        return this.studying;
    }

}
