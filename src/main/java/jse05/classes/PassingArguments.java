package jse05.classes;

public class PassingArguments {

    /**
     * Um metodo pode receber um argumento por parametro ou por referencia
     */

    /**
     * Quando um tipo primitivo e passado por argumento, somente o seu valor e passado para o metodo Ou seja, o que o
     * metodo fizer com esse valor, nao fara efeito para quem chamou
     */

    void modify(int i) {
        i = i + 10;
        System.out.println("Numero modificado: " + i);
    }

    /**
     * Quando um objeto e passado por argumento, nao so o seu valor, mas tambem a sua referencia na memoria e passada
     * para o metodo Ou seja, toda e qualquer alteracao que for feita nesse objeto, ira refletir para quem chamou
     */

    void modify(AccountClass accountClass) {
        accountClass.number = 4321;
        System.out.println("Conta modificada: " + accountClass.number);
    }

}
