package jse06.objects;

public class Objects {

    /**
     * Uma classe � um prot�tipo de um objeto, sendo assim, criamos um objeto a partir de uma classe.
     * O ciclo de vida da cria��o de um objeto � dividido em tr�s partes:
     * 1. Declara��o: ex. Person person;
     * 2. Instancia��o: ex. Person person = new Person();
     * 3. Inicializa��o: ex. Person person = new Person("Carl");
     */

    /**
     * Toda classe, por mais que n�o seja vis�vel, extende da classe Object
     * Por isso, quando uma classe � criada, j� possu� m�todos pr�-definidos, que foram herdados da classe Object
     */

    public static void main (String[] args) {

        /**
         * Quando um objeto � criado, um espa�o na mem�ria � alocado para esse objeto
         * Ele � acessado atrav�s da refer�ncia desse espa�o na mem�ria alocado
         * Portanto cada objeto � unico e n�o compartilha seus estados nem comportamentos com outro objeto
         */

        Person person1 = new Person();
        person1.name = "Carl";

        Person person2 = new Person();
        person2.name = "John";

        System.out.println("Person 1 name: " + person1.name);
        System.out.println("Person 2 name: " + person2.name);
        System.out.println("------------------------------------------");

        /**
         * At� aqui, foram criados dois objetos diferentes
         */

        person1 = person2;

        /**
         * Por�m, como um objeto guarda a refer�ncia do espa�o de mem�ria ao tribuir o person1 ao person2, eles passam a se refer�nciar ao mesmo espa�o de mem�ria
         */

        System.out.println("Person 1 name: " + person1.name);
        System.out.println("Person 2 name: " + person2.name);
        System.out.println("------------------------------------------");

        person2.name = "No name"; // Como os objetos referenciam o mesmo espa�o de mem�ria, a altera��o � acessada pelos dois

        System.out.println("Person 1 name: " + person1.name);
        System.out.println("Person 2 name: " + person2.name);
    }

}
