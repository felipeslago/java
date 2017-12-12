package jse10.nestedClasses;

public class Shadowing {

    /**
     * Quando uma InnerClass possuí uma variável ou método com o mesmo nome de uma variável ou método da OuterClass, é necessário utilizar a palavra reservada this para ter acesso a essas váriaveis e métodos
     */

    public int number = 1;

    class InnerClass {

        public int number = 10;

        void show (int number) {
            System.out.println("Valor de number recebido no método: " + number);
            System.out.println("Valor de number na InnerClass: " + this.number);
            System.out.println("Valor de number na OuterClass: " + Shadowing.this.number);
        }

    }

    public static void main (String[] args) {
        Shadowing shadowing = new Shadowing();
        Shadowing.InnerClass innerClass = shadowing.new InnerClass();
        innerClass.show(5);
    }

}
