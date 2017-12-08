package jse05.classes;

public class PassingArguments {

    /**
     * Um método pode receber um argumento por parâmetro ou por referencia
     */

    /**
     * Quando um tipo primitivo é passado por argumento, somente o seu valor é passado para o método
     * Ou seja, o que o método fizer com esse valor, não fará efeito para quem chamou
     */

    void modify (int i) {
        i = i + 10;
        System.out.println("Número modificado: " + i);
    }

    /**
     * Quando um objeto é passado por argumento, não só o seu valor, mas também a sua referência na memória é passada para o método
     * Ou seja, toda e qualquer alteração que for feita nesse objeto, irá refletir para quem chamou
     */

    void modify (AccountClass accountClass) {
        accountClass.number = 4321;
        System.out.println("Conta modificada: " + accountClass.number);
    }

}
