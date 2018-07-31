package jse09_final_modifier;

public class FinalParameter {

    int number;

    /**
     * Um parametro final recebido em um metodo nao pode ter seu valor modificado Seu valor e somente leitura
     */

    public void setNumber(final int number) {
        // number = 20; // Esse codigo nao ira compilar
        this.number = number;
    }

}
