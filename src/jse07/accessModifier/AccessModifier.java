package jse07.accessModifier;

public class AccessModifier {

    /**
     * Os modificadores de acesso são utilizados para restringir campos e métodos sejam acessados de através outras classes
     * <p>
     * O modificador public permite que a classe, campo ou método seja utilizado por qualquer outra classe
     * <p>
     * O modificador private permite que apenas a própria classe acesse o método ou o campo
     * <p>
     * O modificador protected permite que apenas classes dentro do mesmo pacote acessem o método ou o campo
     * <p>
     * Com isso, conseguimos garantir que outras classes não acessem indevidamente nossos métodos ou classes
     */

    public int age;

    private String name;

    private boolean studying;

    protected String grade;

    /**
     * Os campos definidos como private, muitas vezes possuem informações sensíveis, que não podem ser modificadas ou lidas
     * Porém existem situações em que um campo deve ser somente para leitura
     * Ou então existem regras para atribuir valor ao campo
     * Nestes casos fazemos o uso dos getters e setters
     */

    /**
     * Através do setter, recebemos uma informação e podemos validá-la antes de atribuir ao campo de nossa classe
     * Isso garante uma maior segurança para as regras da classe
     */

    public void setName (String name) {
        if (age > 10) {
            this.name = name;
        } else {
            System.out.println("O aluno precisa ter mais que 10 anos para estudar.");
        }
    }

    /**
     * E através do getter podemos devolver a informação que quisermos para o usuário
     */

    public String getName () {
        return "Nome: " + this.name;
    }

    public void setStudying (boolean studying) {
        this.studying = studying;
    }

    /**
     * Quando trabalhamos com campos boolean é boa pratica alterar o get para is
     */

    public boolean isStudying () {
        return this.studying;
    }

}
