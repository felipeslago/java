package jse05.classes;

public class NestedClass {
	
	/**
	 * Uma classe aninhada � uma classe que est� dentro de outra classe
     */
	
	static class InsideClass {
		
		public void whoAmI() {
			System.out.println("Eu sou uma classe aninhada!");
		}
		
	}
	
	public void hi() {
		InsideClass nc = new InsideClass();
		nc.whoAmI();
	}
	
}
