package jse10_nested_classes;

public class AnonymousClasses {

    /**
     * Outro tipo de classe aninhada e a Anonymous Class Uma Anonymous Class e declarada e instanciada ao mesmo tempo
     */

    interface Anonymous {

        void showMessage(String message);
    }

    public static void main(String[] args) {

        Anonymous anonymous = new Anonymous() {

            @Override
            public void showMessage(final String message) {
                System.out.println(message);
            }
        };

        anonymous.showMessage("Eu sou uma classe anonima!");

    }

}
