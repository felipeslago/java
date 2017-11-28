package jse05.classes;

public class ObjectReference {

	public static void main(String[] args) {
		
		/**
		 * Quando um objeto é criado, um espaço na memória é alocado para esse objeto
         * Ele é acessado através da referência desse espaço na memória alocado
         * Portanto cada objeto é unico e não compartilha seus estados nem comportamentos com outro objeto
         */
		
		AccountClass objeto1 = new AccountClass();
		objeto1.owner = "Java";
		
		AccountClass objeto2 = new AccountClass();
		objeto2.owner = "Oracle";
		
		System.out.println("Owner objeto1: " + objeto1.owner);
		System.out.println("Owner objeto2: " + objeto2.owner);
		
		System.out.println("--------------------------");
		
		/**
         * Aqui criamos dois objetos diferentes
         */
		
		objeto2 = objeto1;
		
		/**
         * Mas como dissemos, um objeto guarda a referência do espaço de memória
         * Sendo assim, ao atribuir o objeto1 ao objeto2, eles passam a se referênciar ao mesmo espaço de memória
         */
		
		System.out.println("Owner objeto1: " + objeto1.owner);
		System.out.println("Owner objeto2: " + objeto2.owner);
		
		objeto2.owner = "No owner"; // Como os objetos referenciam o mesmo espaço de memória, a alteração é acessada pelos dois
		
		System.out.println("--------------------------");
		System.out.println("Owner objeto1: " + objeto1.owner);
		System.out.println("Owner objeto2: " + objeto2.owner);
		
	}
	
}
