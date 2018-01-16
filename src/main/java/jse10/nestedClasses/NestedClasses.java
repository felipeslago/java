package jse10.nestedClasses;

public class NestedClasses {

    /**
     * Uma classe aninhada e uma classe que esta dentro de outra classe
     * <p>
     * Classes aninhadas podem ser divididas em estaticas e nao estaticas
     * <p>
     * Classes aninhadas estaticas sao chamadas de static nested classes
     * <p>
     * Classes aninhadas nao estaticas sao chamadas de inner classes
     * <p>
     * IMPORTANTE: A serializacao de classes aninhadas e extremamente nao recomendada.
     */

    private String text;

    static class StaticNestedClass {

        /**
         * Classes aninhadas estaticas nao possuem acesso a membros da classe em que foi declarada
         */

        public void whoAmI() {
            System.out.println("Eu sou uma classe estatica aninhada!");
        }

    }

    class InnerClass {

        /**
         * Classes aninhadas nao estaticas possuem acesso a memebros da classe em que foi declarada, mesmo que sejam
         * privados
         */

        public void whoAmI() {
            text = "Eu sou uma classe nao estatica aninhada!";
            System.out.println(text);
        }

    }

}
