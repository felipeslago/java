package jse10.nestedClasses;

public class Shadowing {

    /**
     * Quando uma InnerClass possu� uma vari�vel ou m�todo com o mesmo nome de uma vari�vel ou m�todo da OuterClass, � necess�rio utilizar a palavra reservada this para ter acesso a essas v�riaveis e m�todos
     */

    public int number = 1;

    class InnerClass {

        public int number = 10;

        void show (int number) {
            System.out.println("Valor de number recebido no m�todo: " + number);
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
