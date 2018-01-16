package jse15.interfaces;

public interface OperateCar { // O comando interface determina a criacao de uma interface

    /**
     * Uma interface e um contrato, um tipo de referencia, similar a uma classe Porem aceita apenas metodos abstratos,
     * metodos default e metodos estaticos
     */

    void direction(Direction direction);

    void speedUp(int speed);

    void speedDown(int speed);

    void stop();

    int speed();

    /**
     * A interface diz para as classes o que elas devem fazer, mas nao como devem fazer Por exemplo: Todos fabricantes
     * de carros constroem carros e todos carros deve acelerar, frear e etc. Porem cada fabricante implementa isso da
     * sua maneira Esse e o contrato, a interface, existente entre os fabricantes
     */

}
