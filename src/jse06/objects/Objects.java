package jse06.objects;

public class Objects {

    /**
     * Uma classe é um protótipo de um objeto, sendo assim, criamos um objeto a partir de uma classe.
     * O ciclo de vida da criação de um objeto é dividido em três partes:
     * 1. Declaração: ex. Person person;
     * 2. Instanciação: ex. Person person = new Person();
     * 3. Inicialização: ex. Person person = new Person("Carl");
     */

    /**
     * Toda classe, por mais que não seja visível, extende da classe Object
     * Por isso, quando uma classe é criada, já possuí métodos pré-definidos, que foram herdados da classe Object
     */

    public static void main (String[] args) {

        /**
         * Quando um objeto é criado, um espaço na memória é alocado para esse objeto
         * Ele é acessado através da referência desse espaço na memória alocado
         * Portanto cada objeto é unico e não compartilha seus estados nem comportamentos com outro objeto
         */

        Person person1 = new Person();
        person1.name = "Carl";

        Person person2 = new Person();
        person2.name = "John";

        System.out.println("Person 1 name: " + person1.name);
        System.out.println("Person 2 name: " + person2.name);
        System.out.println("------------------------------------------");

        /**
         * Até aqui, foram criados dois objetos diferentes
         */

        person1 = person2;

        /**
         * Porém, como um objeto guarda a referência do espaço de memória ao tribuir o person1 ao person2, eles passam a se referênciar ao mesmo espaço de memória
         */

        System.out.println("Person 1 name: " + person1.name);
        System.out.println("Person 2 name: " + person2.name);
        System.out.println("------------------------------------------");

        person2.name = "No name"; // Como os objetos referenciam o mesmo espaço de memória, a alteração é acessada pelos dois

        System.out.println("Person 1 name: " + person1.name);
        System.out.println("Person 2 name: " + person2.name);
    }

}
