package jse05.classes;

public class ObjectReference {

	public static void main(String[] args) {
		
		/**
		 * Quando um objeto � criado, um espa�o na mem�ria � alocado para esse objeto
         * Ele � acessado atrav�s da refer�ncia desse espa�o na mem�ria alocado
         * Portanto cada objeto � unico e n�o compartilha seus estados nem comportamentos com outro objeto
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
         * Mas como dissemos, um objeto guarda a refer�ncia do espa�o de mem�ria
         * Sendo assim, ao atribuir o objeto1 ao objeto2, eles passam a se refer�nciar ao mesmo espa�o de mem�ria
         */
		
		System.out.println("Owner objeto1: " + objeto1.owner);
		System.out.println("Owner objeto2: " + objeto2.owner);
		
		objeto2.owner = "No owner"; // Como os objetos referenciam o mesmo espa�o de mem�ria, a altera��o � acessada pelos dois
		
		System.out.println("--------------------------");
		System.out.println("Owner objeto1: " + objeto1.owner);
		System.out.println("Owner objeto2: " + objeto2.owner);
		
	}
	
}
