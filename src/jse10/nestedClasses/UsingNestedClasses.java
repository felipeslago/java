package jse10.nestedClasses;

public class UsingNestedClasses {

    public static void main (String[] args) {

        /**
         * A classe NestedClass tem as classes StaticNestedClass e InnerClass dentro dela
         */

        /**
         * Para acessar classes estáticas, basta referenciar o membro estático precedido da classe em que foi declarado
         */

        NestedClasses.StaticNestedClass staticNestedClass = new NestedClasses.StaticNestedClass();
        staticNestedClass.whoAmI();

        /**
         * Para acessar classes não estáticas, primeiro é necessário criar uma instância da classe em que foi declarada (classe externa ou outer class)
         * Após isso, é necessário referenciar a classe não estática precedida da classa em que foi declarada
         * E para finalizar, a instância da classe externa junto a palavra new cria uma instância da InnerClass
         */

        NestedClasses nestedClasses = new NestedClasses();
        NestedClasses.InnerClass innerClass = nestedClasses.new InnerClass();
        innerClass.whoAmI();

    }

}
