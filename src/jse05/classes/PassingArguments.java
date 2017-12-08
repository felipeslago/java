package jse05.classes;

public class PassingArguments {

    /**
     * Um m�todo pode receber um argumento por par�metro ou por referencia
     */

    /**
     * Quando um tipo primitivo � passado por argumento, somente o seu valor � passado para o m�todo
     * Ou seja, o que o m�todo fizer com esse valor, n�o far� efeito para quem chamou
     */

    void modify (int i) {
        i = i + 10;
        System.out.println("N�mero modificado: " + i);
    }

    /**
     * Quando um objeto � passado por argumento, n�o s� o seu valor, mas tamb�m a sua refer�ncia na mem�ria � passada para o m�todo
     * Ou seja, toda e qualquer altera��o que for feita nesse objeto, ir� refletir para quem chamou
     */

    void modify (AccountClass accountClass) {
        accountClass.number = 4321;
        System.out.println("Conta modificada: " + accountClass.number);
    }

}
