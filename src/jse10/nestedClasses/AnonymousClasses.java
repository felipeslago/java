package jse10.nestedClasses;

public class AnonymousClasses {

    /**
     * Outro tipo de classe aninhada é a Anonymous Class
     * Uma Anonymous Class é declarada e instânciada ao mesmo tempo
     */

    interface Anonymous {

        void showMessage (String message);
    }

    public static void main (String[] args) {

        Anonymous anonymous = new Anonymous() {

            @Override
            public void showMessage (final String message) {
                System.out.println(message);
            }
        };

        anonymous.showMessage("Eu sou uma classe anônima!");

    }

}
