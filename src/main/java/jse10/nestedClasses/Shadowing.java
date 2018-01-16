package jse10.nestedClasses;

public class Shadowing {

    /**
     * Quando uma InnerClass possui uma variavel ou metodo com o mesmo nome de uma variavel ou metodo da OuterClass, e
     * necessario utilizar a palavra reservada this para ter acesso a essas variaveis e metodos
     */

    public int number = 1;

    class InnerClass {

        public int number = 10;

        void show(int number) {
            System.out.println("Valor de number recebido no metodo: " + number);
            System.out.println("Valor de number na InnerClass: " + this.number);
            System.out.println("Valor de number na OuterClass: " + Shadowing.this.number);
        }

    }

    public static void main(String[] args) {
        Shadowing shadowing = new Shadowing();
        Shadowing.InnerClass innerClass = shadowing.new InnerClass();
        innerClass.show(5);
    }

}
