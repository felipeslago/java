package jse08.staticModifier;

public class Static {

	/**
	 * A palavra-chave static torna as propriedades e métodos acessíveis sem a necessidade de criar uma instância desse objeto
     */
	
	public static int age;
	
	public static void Execute() {
		System.out.println("I am a static method");
	}
	
	/**
     * Uma classe pode ter quantos blocos estáticos forem necessarios
     * Os blocos estáticos são chamados quando a JVM carrega a classe
     */
	
	static {
		age = 10;
	}

}
