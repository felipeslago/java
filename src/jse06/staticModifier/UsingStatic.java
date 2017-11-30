package jse06.staticModifier;

public class UsingStatic {

	public static void main(String[] args) {
		
		System.out.println(Static.age); // A propriedade age tem o valor que foi inicializado no bloco estático
		Static.age = 20; // Define o valor da propriedade sem criar um novo objeto
		System.out.println(Static.age);
		Static.Execute(); // Usando um método estático sem criar um objeto
		
	}
	
}