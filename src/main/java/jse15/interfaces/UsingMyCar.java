package jse15.interfaces;

public class UsingMyCar {

    public static void main(String[] args) {

        /**
         * O uso da classe que implementa a interface ocorre normalmente
         */

        MyCar car = new MyCar();
        car.direction(Direction.FORWARD);
        car.speedUp(20);
        System.out.println("Car speed: " + car.speed());
        car.speedDown(10);
        System.out.println("Car speed: " + car.speed());
        car.honk();
        car.stop();

        /**
         * Uma interface nao pode ser instanciada, porem pode receber um objeto que a implemente Porem, por ser uma
         * interface, somente os metodos e propriedades definidas nela podem ser acessados
         */

        OperateCar car2 = new MyCar(); // Interface OperateCar recebendo um objeto MyCar
        car2.direction(Direction.FORWARD);
        car2.speedUp(20);
        System.out.println("Car speed: " + car2.speed());
        car2.speedDown(10);
        System.out.println("Car speed: " + car2.speed());
        // car2.honk(); -> esse metodo e definido somente na classe MyCar e nao na interface, por isso nao e acessivel
        // aqui
        car2.stop();

    }

}
