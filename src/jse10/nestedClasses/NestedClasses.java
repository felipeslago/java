package jse10.nestedClasses;

public class NestedClasses {

    /**
     * Uma classe aninhada � uma classe que est� dentro de outra classe
     * <p>
     * Classes aninhadas podem ser divididas em est�ticas e n�o est�ticas
     * <p>
     * Classes aninhadas est�ticas s�o chamadas de static nested classes
     * <p>
     * Classes aninhadas n�o est�ticas s�o chamadas de inner classes
     * <p>
     * IMPORTANTE: A serializa��o de classes aninhadas � extremamente n�o recomendada.
     */

    private String text;

    static class StaticNestedClass {

        /**
         * Classes aninhadas est�ticas n�o possuem acesso a membros da classe em que foi declarada
         */

        public void whoAmI () {
            System.out.println("Eu sou uma classe est�tica aninhada!");
        }

    }

    class InnerClass {

        /**
         * Classes aninhadas n�o est�ticas possuem acesso a memebros da classe em que foi declarada, mesmo que sejam privados
         */

        public void whoAmI () {
            text = "Eu sou uma classe n�o est�tica aninhada!";
            System.out.println(text);
        }

    }

}
