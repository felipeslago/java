package jse05.classes;

public class UsingNestedClasses {

	public static void main(String[] args) {

        /**
         * A classe NestedClass tem a classe InsideClass dentro dela
         * Para acessá-la, é necessário referenciá-la como se fosse uma variável
         */

		NestedClass obj = new NestedClass();
		obj.hi();

		NestedClass.InsideClass insideClass = new NestedClass.InsideClass();

		insideClass.whoAmI();
	}
	
}
