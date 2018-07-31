package jse05_classes;

public class UsingClasses {

    public static void main(String[] args) {

        /**
         * Objetos sao definidos como se fossem variaveis, porem sao criado atraves do comando new
         */

        AccountClass account = new AccountClass(); // Criando um objeto
        account.owner = "Java"; // Acessando um campo do objeto
        account.limit = 200.0; // Modificando um campo do objeto
        account.deposit(100.0); // Chamando um metodo do objeto, passando um parametro

        System.out.println("Owner: " + account.owner);
        System.out.println("Total balance: " + account.totalBalance()); // Acessando um metodo do objeto que retorna um
                                                                        // valor

        System.out.println("----------------------------");

        Constructor object = new Constructor(); // Criando um objeto com o construtor vazio
        System.out.println("Age: " + object.age);
        System.out.println("Name: " + object.name);

        System.out.println("----------------------------");

        Constructor object2 = new Constructor(30, "Oracle"); // Criando um objeto com o construtor com argumentos
        System.out.println("Age: " + object2.age);
        System.out.println("Name: " + object2.name);
    }

}
