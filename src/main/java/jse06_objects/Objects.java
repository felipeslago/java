package jse06_objects;

public class Objects {

    /**
     * Uma classe e um prototipo de um objeto, sendo assim, criamos um objeto a partir de uma classe. O ciclo de vida da
     * criacao de um objeto e dividido em tres partes: 1. Declaracao: ex. Person person; 2. Instanciacao: ex. Person
     * person = new Person(); 3. Inicializacao: ex. Person person = new Person("Carl");
     */

    /**
     * Toda classe, por mais que nao seja visivel, extende da classe Object Por isso, quando uma classe e criada, ja
     * possui metodos pre-definidos, que foram herdados da classe Object
     */

    public static void main(String[] args) {

        /**
         * Quando um objeto e criado, um espaco na memoria e alocado para esse objeto Ele e acessado atraves da
         * referencia desse espaco na memoria alocado Portanto cada objeto e unico e nao compartilha seus estados nem
         * comportamentos com outro objeto
         */

        Person person1 = new Person();
        person1.name = "Carl";

        Person person2 = new Person();
        person2.name = "John";

        System.out.println("Person 1 name: " + person1.name);
        System.out.println("Person 2 name: " + person2.name);
        System.out.println("------------------------------------------");

        /**
         * Ate aqui, foram criados dois objetos diferentes
         */

        person1 = person2;

        /**
         * Porem, como um objeto guarda a referencia do espaco de memoria ao tribuir o person1 ao person2, eles passam a
         * se referenciar ao mesmo espaco de memoria
         */

        System.out.println("Person 1 name: " + person1.name);
        System.out.println("Person 2 name: " + person2.name);
        System.out.println("------------------------------------------");

        person2.name = "No name"; // Como os objetos referenciam o mesmo espaco de memoria, a alteracao e acessada pelos
                                  // dois

        System.out.println("Person 1 name: " + person1.name);
        System.out.println("Person 2 name: " + person2.name);
    }

}
