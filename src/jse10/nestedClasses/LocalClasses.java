package jse10.nestedClasses;

public class LocalClasses {

    /**
     * Outro tipo de classe aninhada � a Local Class
     * Uma Local Class � uma classe definida dentro de um bloco, normalmente definidas dentro de um m�todo
     */

    public static void changeName (String name) {

        class Local {

            String changedName;

            Local (String name) {
                changedName = name + " > changed!";
            }

            public String getChangedName () {
                return changedName;
            }
        }

        Local local = new Local(name);
        System.out.println("Nome original: " + name);
        System.out.println("Nome alterado: " + local.getChangedName());

    }

    public static void main (String[] args) {
        changeName("Carl");
    }

}
