package jse05.classes;

public class Constructor {

    /**
     * Um construtor e um metodo invocado assim que o objeto e criado Ele obriga que quem o criou informe seus os
     * parametros definidos por ele
     */

    int age;

    String name;

    /**
     * O construtor e sempre um metodo com o mesmo nome da classe
     */

    /**
     * Neste caso temos um construtor vazio, portanto nenhum parametro e obrigatorio
     */

    Constructor() {

        /**
         * No construtor, sempre que um objeto e criado, as expressoes dentro do construtor serao executadas
         */

        this.age = 18;
        this.name = "Java";
    }

    /**
     * Aqui temos um construtor que esta esperando receber dois parametros Repare que utilizamos o overload de metodos
     * aqui
     */

    Constructor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * Caso nao seja especificado um construtor para uma classe, um construtor vazio sera provido pelo Java compiler
     */
}
