package jse10.nestedClasses;

public class UsingNestedClasses {

    public static void main(String[] args) {

        /**
         * A classe NestedClass tem as classes StaticNestedClass e InnerClass dentro dela
         */

        /**
         * Para acessar classes estaticas, basta referenciar o membro estatico precedido da classe em que foi declarado
         */

        NestedClasses.StaticNestedClass staticNestedClass = new NestedClasses.StaticNestedClass();
        staticNestedClass.whoAmI();

        /**
         * Para acessar classes nao estaticas, primeiro e necessario criar uma instancia da classe em que foi declarada
         * (classe externa ou outer class) Apos isso, e necessario referenciar a classe nao estatica precedida da classa
         * em que foi declarada E para finalizar, a instancia da classe externa junto a palavra new cria uma instancia
         * da InnerClass
         */

        NestedClasses nestedClasses = new NestedClasses();
        NestedClasses.InnerClass innerClass = nestedClasses.new InnerClass();
        innerClass.whoAmI();

    }

}
