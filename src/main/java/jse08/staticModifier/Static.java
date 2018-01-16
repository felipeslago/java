package jse08.staticModifier;

public class Static {

    /**
     * A palavra-chave static torna as propriedades e metodos acessiveis sem a necessidade de criar uma instancia desse
     * objeto
     */

    public static int age;

    public static void Execute() {
        System.out.println("I am a static method");
    }

    /**
     * Uma classe pode ter quantos blocos estaticos forem necessarios Os blocos estaticos sao chamados quando a JVM
     * carrega a classe
     */

    static {
        age = 10;
    }

}
