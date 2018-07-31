package jse15_interfaces;

public class MyCar implements OperateCar { // O comando implements determina que a classe MyCar ira implementar o
                                           // contrato da interface OperateCar

    /**
     * Utilizando uma , apos a interface e possivel implementar mais de uma interface
     */

    Direction direction;
    int speed;

    /**
     * Uma interface nao pode ser instanciada, ela deve ser implementada Ou seja, todas as assinaturas de metodos
     * descritas na interface devem ser implementadas na classe Caso os metodos nao sejam implementados, a classe nao
     * ira compilar
     */

    @Override
    // A anotacao Override indica que o metodo direction esta sobrescrevendo a assinatura da interface
    public void direction(Direction direction) {
        this.direction = direction;
    }

    @Override
    public void speedUp(int speed) {
        System.out.println("Acelerando o carro...");
        this.speed += speed;
    }

    @Override
    public void speedDown(int speed) {
        System.out.println("Desacelerando o carro...");
        this.speed -= speed;
    }

    @Override
    public void stop() {
        System.out.println("Parando o carro...");
        this.speed = 0;
    }

    @Override
    public int speed() {
        return this.speed;
    }

    public void honk() {
        System.out.println("Honked!");
    }

}
