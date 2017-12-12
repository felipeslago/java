package jse10.nestedClasses;

public class NestedClasses {

    /**
     * Uma classe aninhada é uma classe que está dentro de outra classe
     * <p>
     * Classes aninhadas podem ser divididas em estáticas e não estáticas
     * <p>
     * Classes aninhadas estáticas são chamadas de static nested classes
     * <p>
     * Classes aninhadas não estáticas são chamadas de inner classes
     * <p>
     * IMPORTANTE: A serialização de classes aninhadas é extremamente não recomendada.
     */

    private String text;

    static class StaticNestedClass {

        /**
         * Classes aninhadas estáticas não possuem acesso a membros da classe em que foi declarada
         */

        public void whoAmI () {
            System.out.println("Eu sou uma classe estática aninhada!");
        }

    }

    class InnerClass {

        /**
         * Classes aninhadas não estáticas possuem acesso a memebros da classe em que foi declarada, mesmo que sejam privados
         */

        public void whoAmI () {
            text = "Eu sou uma classe não estática aninhada!";
            System.out.println(text);
        }

    }

}
